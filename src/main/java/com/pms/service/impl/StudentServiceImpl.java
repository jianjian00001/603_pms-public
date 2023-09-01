package com.pms.service.impl;

import com.pms.dao.PreselectionMapper;
import com.pms.dao.StudentMapper;
import com.pms.dao.TeacherMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.*;
import com.pms.service.MajorService;
import com.pms.service.PreselectionService;
import com.pms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/1.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private PreselectionMapper preselectionMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private PreselectionService preselectionService;

    @Autowired
    private MajorService majorService;

    @Override
    public Student findAllById(Integer stuId) {
        if(stuId == null) return null;
        return studentMapper.selectByPrimaryKey(stuId);
    }

    //预选老师
    @Override
    public JsonResult addPreTeacher(Integer stuId, Integer teacherId) {
        if(stuId == null || teacherId == null) return new JsonResult(false,"stuId || teacherId为空");

        Preselection preselection = new Preselection();
        preselection.setPreCreatetime(new Date());
        preselection.setStuId(stuId);
        preselection.setTeacherId(teacherId);
        //检查是否选过同个老师
        PreselectionExample preselectionExample = new PreselectionExample();
        preselectionExample.createCriteria().andStuIdEqualTo(stuId).andTeacherIdEqualTo(teacherId);
        List<Preselection> preselections = preselectionMapper.selectByExample(preselectionExample);
        if(preselections != null && preselections.size() > 0) return new JsonResult(false,"预选失败!你选过该老师了！");
        int i = preselectionMapper.insertSelective(preselection);
        return i > 0 ? new JsonResult(true,"预选成功!") : new JsonResult(false,"预选失败!");
    }
    //取消预选
    @Override
    public JsonResult removePreTeacher(Integer stuId, Integer teacherId) {
        if(stuId == null || teacherId == null) return new JsonResult(false,"stuId || teacherId为空");

        //如果老师已答复则不能取消预选
        PreselectionExample preselectionExample = new PreselectionExample();
        preselectionExample.createCriteria().andStuIdEqualTo(stuId).andTeacherIdEqualTo(teacherId);
        List<Preselection> preselections = preselectionMapper.selectByExample(preselectionExample);
        if(preselections != null && preselections.size() >0){
            Preselection preselection = preselections.get(0);
            if(preselection.getPrePassFlag() != 0) return new JsonResult(false,"取消预选失败！老师已答复你！");
        }

        int i = preselectionMapper.deleteByExample(preselectionExample);
        return i > 0 ? new JsonResult(true,"取消预选成功!") : new JsonResult(false,"取消预选失败!你未有预选该老师!");
    }


    //确认选择该老师 update会触发行级锁 应放到最后
    @Transactional
    @Override
    public JsonResult chooseTeacher(Integer preId,Integer teacherId,Integer stuId) {
        try {
            if(preId != null && teacherId != null){
                //判断自己是否选择了老师
                PreselectionExample example = new PreselectionExample();
                example.createCriteria().andStuIdEqualTo(stuId);
                List<Preselection> preselections = preselectionMapper.selectByExample(example);
                if(preselections != null && preselections.size() >0){
                    for (Preselection preselection : preselections) {
                        if(preselection.getPreFlag() == 1) // 1已经选了老师 0未选
                            return new JsonResult(false,"选择失败!你已经选择了老师!");
                    }
                }
                //判断老师是否还有名额
                Teacher teacher = teacherMapper.selectByPrimaryKey(teacherId);
                if(teacher.getLimitCount() <= 0) return new JsonResult(false,"选择失败!老师名额已满!");
                //更新老师数量 -1
                teacher.setLimitCount(teacher.getLimitCount() - 1);
                teacher.setTeacherUpdatetime(new Date());
                int effectRow1 = teacherMapper.updateByPrimaryKeySelective(teacher);
                if(effectRow1 > 0) {
                    Preselection preselection = new Preselection();
                    preselection.setPreId(preId);
                    //设置为已经选择该老师了
                    preselection.setPreFlag(1);
                    preselection.setPreUpdatetime(new Date());
                    int effectRow2 = preselectionMapper.updateByPrimaryKeySelective(preselection);
                    return effectRow2 > 0 ? new JsonResult(false,"选择成功!") :
                            new JsonResult(false,"选择失败!");
                } return  new JsonResult(false,"选择失败!");
            }else{
                return new JsonResult(false,"选择失败! preId || teacherId为空!");
            }
        }catch (Exception e ){
            throw new RuntimeException(e.getMessage());
        }
    }


    //取消该老师 update会触发行级锁 应放到最后
    @Transactional
    @Override
    public JsonResult cancelChooseTeacher(Integer preId, Integer teacherId) {
        try {
            if(preId != null && teacherId != null){
                Teacher teacher = teacherMapper.selectByPrimaryKey(teacherId);
                //更新老师指导名额数量 +1
                teacher.setLimitCount(teacher.getLimitCount() + 1);
                teacher.setTeacherUpdatetime(new Date());
                int effectRow1 = teacherMapper.updateByPrimaryKeySelective(teacher);
                if(effectRow1 > 0) {
                    Preselection preselection = new Preselection();
                    preselection.setPreId(preId);
                    //设置为未选择该老师
                    preselection.setPreFlag(0);
                    preselection.setPreUpdatetime(new Date());
                    int effectRow2 = preselectionMapper.updateByPrimaryKeySelective(preselection);
                    return effectRow2 > 0 ? new JsonResult(false,"取消成功!") :
                            new JsonResult(false,"取消失败!");
                } return  new JsonResult(false,"取消失败!");
            }else{
                return new JsonResult(false,"取消失败! preId || teacherId为空!");
            }
        }catch (Exception e ){
            throw new RuntimeException(e.getMessage());
        }
    }

    //todo sql优化
    @Override
    public List<Student> findAllByChooseTeacherId(Integer teacherId) {

        if(teacherId == null) return null;
        List<Student> students = new ArrayList<>();
        List<Preselection> preselections = preselectionService.findAllByPreFlag1(teacherId);
        if(preselections != null && preselections.size() > 0){
            for (Preselection preselection : preselections) {
                Student student = findAllById(preselection.getStuId());
                student.setMajor(majorService.findAllById(student.getMajorId()));
                students.add(student);
            }
        }
        return students;
    }


    @Override
    public JsonResult add(Student student) {
        if(student == null) return new JsonResult(false,"添加失败!空指针异常!");
        Student s = findAllByNo(student.getStuNo());
        if(s != null) return new JsonResult(false,"添加失败!,添加学号已存在!");
        student.setStuCreatetime(new Date());
        int i = studentMapper.insertSelective(student);
        return i > 0 ? new JsonResult(true,"添加学生成功!"):
                new JsonResult(false,"添加学生失败!");
    }

    @Override
    public Student findAllByNo(String stuNo) {
        if(stuNo == null) return null;
        StudentExample example = new StudentExample();
        example.createCriteria().andStuNoEqualTo(stuNo);
        List<Student> students = studentMapper.selectByExample(example);
        if(students == null || students.size() == 0)  return null;
        return students.get(0);
    }

    @Override
    public JsonResult update(Student student) {
        if(student == null  || student.getStuId() == null) return new JsonResult(false,"更新失败!空指针异常!");
        student.setStuUpdatetime(new Date());
        int i = studentMapper.updateByPrimaryKeySelective(student);
        return i > 0 ? new JsonResult(true,"更新学生成功!"):
                new JsonResult(false,"更新学生失败!");
    }

    @Override
    public List<Student> findAll(){
        List<Student> students = studentMapper.selectByExample(new StudentExample());
        for (Student student : students) {
            student.setMajor(majorService.findAllById(student.getMajorId()));
        }
        return students;
    }

    @Override
    public JsonResult deleteById(Integer stuId) {
        if(stuId == null) return new JsonResult(false,"删除失败！空指针异常!");
        return studentMapper.deleteByPrimaryKey(stuId) > 0 ? new JsonResult(true,"删除成功!")
                : new JsonResult(false,"删除失败!");
    }


}
