package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ming on 2018/3/1.
 */
public interface StudentService {

    Student findAllById(Integer stuId);

    JsonResult addPreTeacher(Integer stuId, Integer teacherId);

    JsonResult removePreTeacher(Integer stuId, Integer teacherId);

    @Transactional
    JsonResult chooseTeacher(Integer preId,Integer teacherId,Integer stuId);

    //确认选择该老师 update会触发行级锁 应放到最后
    @Transactional
    JsonResult cancelChooseTeacher(Integer preId, Integer teacherId);

    //找选了teacherId的所有学生
     List<Student> findAllByChooseTeacherId(Integer teacherId);



    JsonResult add(Student student);

    Student findAllByNo(String stuNo);

    JsonResult update(Student student);

    List<Student> findAll();

    JsonResult deleteById(Integer stuId);
}
