package com.pms.service.impl;

import com.pms.dao.PreselectionMapper;
import com.pms.dao.StudentMapper;
import com.pms.dao.TeacherMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.Preselection;
import com.pms.pojo.PreselectionExample;
import com.pms.pojo.Student;
import com.pms.pojo.Teacher;
import com.pms.service.PreselectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/2.
 */
@Service
public class PreselectionServiceImpl implements PreselectionService{

    @Autowired
    private PreselectionMapper preselectionMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private StudentMapper studentMapper;

    //todo sql 优化
    @Override
    public List<Preselection> findAllByStuId(Integer stuId) {
        if(stuId == null) return null;
        PreselectionExample example = new PreselectionExample();
        example.createCriteria().andStuIdEqualTo(stuId);
        List<Preselection> preselections = preselectionMapper.selectByExample(example);
        for (Preselection preselection : preselections) {
            Teacher teacher = teacherMapper.selectByPrimaryKey(preselection.getTeacherId());
            preselection.setTeacher(teacher);
        }
        return preselections;
    }

    //todo  sql优化
    @Override
    public List<Preselection> findAllByTeacherId(Integer teacherId) {
        if(teacherId == null) return null;
        PreselectionExample example = new PreselectionExample();
        example.createCriteria().andTeacherIdEqualTo(teacherId);
        List<Preselection> preselections = preselectionMapper.selectByExample(example);
        for (Preselection preselection : preselections) {
            Student student = studentMapper.selectByPrimaryKey(preselection.getStuId());
            preselection.setStudent(student);
        }
        return preselections;
    }

    //查找学生选择了我的数据
    @Override
    public List<Preselection> findAllByPreFlag1(Integer teacherId) {
        if(teacherId == null) return null;
        PreselectionExample example = new PreselectionExample();
        example.createCriteria().andTeacherIdEqualTo(teacherId).andPreFlagEqualTo(1);
        List<Preselection> preselections = preselectionMapper.selectByExample(example);
        for (Preselection preselection : preselections) {
            Student student = studentMapper.selectByPrimaryKey(preselection.getStuId());
            preselection.setStudent(student);
        }
        return preselections;
    }


    @Override
    public JsonResult replayStudent(Preselection preselection) {
            if(preselection == null) return new JsonResult(false,"回复失败!空指针异常!");
            Preselection preselection1 = preselectionMapper.selectByPrimaryKey(preselection.getPreId());
            if(preselection1 != null && preselection1.getPreFlag() == 1) return new JsonResult(false,"回复失败！学生已选择您!");

            preselection.setPreUpdatetime(new Date());
            int i = preselectionMapper.updateByPrimaryKeySelective(preselection);
            return i > 0 ? new JsonResult(true,"回复成功!") :
                    new JsonResult(false,"回复失败!");

    }
}
