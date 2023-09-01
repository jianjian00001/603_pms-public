package com.pms.service.impl;

import com.pms.dao.TeacherMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.*;
import com.pms.pojo.Teacher;
import com.pms.service.CourseService;
import com.pms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/1.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private CourseService courseService;

    @Override
    public List<Teacher> findAllByMajorId(Integer majorId) {
        if(majorId != null)
        return teacherMapper.findByMajorId(majorId);
        return null;
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> teachers = teacherMapper.selectByExample(new TeacherExample());
        for (Teacher teacher : teachers) {
            teacher.setCourse(courseService.findAllById(teacher.getCourseId()));
        }
        return teachers;
    }

    @Override
    public Teacher findAllById(Integer teacherId) {
        if(teacherId == null) return null;
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public JsonResult add(Teacher teacher) {
        if(teacher == null) return new JsonResult(false,"添加失败!空指针异常!");
        Teacher t = findAllByNo(teacher.getTeacherNo());
        if(t != null) return new JsonResult(false,"添加失败!,添加老师号已存在!");
        teacher.setTeacherCreatetime(new Date());
        int i = teacherMapper.insertSelective(teacher);
        return i > 0 ? new JsonResult(true,"添加老师成功!"):
                new JsonResult(false,"添加老师失败!");
    }

    @Override
    public Teacher findAllByNo(String teacherNo) {
        if(teacherNo == null) return null;
        TeacherExample example = new TeacherExample();
        example.createCriteria().andTeacherNoEqualTo(teacherNo);
        List<Teacher> teachers = teacherMapper.selectByExample(example);
        if(teachers == null || teachers.size() == 0)  return null;
        return teachers.get(0);
    }

    @Override
    public JsonResult update(Teacher teacher) {
        if(teacher == null  || teacher.getTeacherId() == null) return new JsonResult(false,"更新失败!空指针异常!");
        teacher.setTeacherUpdatetime(new Date());
        int i = teacherMapper.updateByPrimaryKeySelective(teacher);
        return i > 0 ? new JsonResult(true,"更新老师成功!"):
                new JsonResult(false,"更新老师失败!");
    }


    @Override
    public JsonResult deleteById(Integer teacherId) {
        if(teacherId == null) return new JsonResult(false,"删除失败!空指针异常!");
        int i = teacherMapper.deleteByPrimaryKey(teacherId);
        return i > 0 ? new JsonResult(true,"删除老师成功!"):
                new JsonResult(false,"删除老师失败!");
    }
    
}
