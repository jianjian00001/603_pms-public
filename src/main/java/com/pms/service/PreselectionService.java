package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Preselection;

import java.util.List;

/**
 * Created by Ming on 2018/3/2.
 */
public interface PreselectionService {

    List<Preselection> findAllByStuId(Integer stuId);

    List<Preselection> findAllByTeacherId(Integer teacherId);

    //查找学生选择了我的数据
    List<Preselection> findAllByPreFlag1(Integer teacherId);

    JsonResult replayStudent(Preselection preselection);

}
