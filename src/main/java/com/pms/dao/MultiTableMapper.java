package com.pms.dao;




import com.pms.dto.StuAndTestAndCourseAndMajor;

import java.util.List;


// 多表mapper
public interface MultiTableMapper {



    //根据学生ID查找 答卷
    List<StuAndTestAndCourseAndMajor> findTestByStuId(Integer stuId);

    List<StuAndTestAndCourseAndMajor> findTestByCourseId(Integer courseId);

    //根据学生ID查找 成绩在top3的test信息
    List<StuAndTestAndCourseAndMajor>findTestTop3ByStuId(Integer stuId);
}