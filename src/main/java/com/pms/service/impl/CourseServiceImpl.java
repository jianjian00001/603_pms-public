package com.pms.service.impl;

import com.pms.dao.CourseMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.Course;
import com.pms.pojo.CourseExample;
import com.pms.service.CourseService;
import com.pms.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/1.
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private MajorService majorService;


    @Override
    public List<Course> findAllByMajorId(Integer majorId) {
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andMajorIdEqualTo(majorId);
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public Course findAllById(Integer courseId) {
        if(courseId != null) return courseMapper.selectByPrimaryKey(courseId);
        return null;
    }

    @Override
    public JsonResult add(Course course) {
        if(course == null) return new JsonResult(false,"添加失败!空指针异常!");
        course.setCourseCreatetime(new Date());
        int i = courseMapper.insertSelective(course);
        return i > 0 ? new JsonResult(true,"添加课程成功!"):
                new JsonResult(false,"添加课程失败!");
    }

    @Override
    public JsonResult update(Course course) {
        if(course == null  || course.getCourseId() == null) return new JsonResult(false,"更新失败!空指针异常!");
        course.setCourseCreatetime(new Date());
        int i = courseMapper.updateByPrimaryKeySelective(course);
        return i > 0 ? new JsonResult(true,"更新课程成功!"):
                new JsonResult(false,"更新课程失败!");
    }

    //todo sql 优化
    @Override
    public List<Course> findAll() {
        List<Course> courseList = courseMapper.selectByExample(new CourseExample());
        for (Course course : courseList) {
            course.setMajor(majorService.findAllById(course.getMajorId()));
        }
        return courseList;
    }

    @Override
    public JsonResult deleteById(Integer courseId) {
        if(courseId == null) return new JsonResult(false,"删除失败!空指针异常!");
        return courseMapper.deleteByPrimaryKey(courseId) > 0 ? new JsonResult(true,"删除成功!")
                : new JsonResult(false,"删除失败!");
    }
}
