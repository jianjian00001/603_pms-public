package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Teacher;

import java.util.List;

/**
 * Created by Ming on 2018/3/1.
 */

public interface TeacherService {

    //根据专业查找老师
    List<Teacher>  findAllByMajorId(Integer majorId);

    List<Teacher> findAll();

    Teacher findAllById(Integer teacherId);

    JsonResult add(Teacher teacher);

    Teacher findAllByNo(String teacherNo);

    JsonResult update(Teacher teacher);

    JsonResult deleteById(Integer teacherId);
}
