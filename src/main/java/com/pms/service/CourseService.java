package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Course;

import java.util.List;

/**
 * Created by Ming on 2018/3/1.
 */
public interface CourseService {

    List<Course> findAllByMajorId(Integer majorId);

    Course findAllById(Integer courseId);

    JsonResult add(Course course);

    JsonResult update(Course course);

    List<Course> findAll();

    JsonResult deleteById(Integer courseId);

}
