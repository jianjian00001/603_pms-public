package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.College;

import java.util.List;

/**
 * Created by Ming on 2018/3/3.
 */
public interface CollegeService {


    List<College> finAll();

    College findById(Integer collegeId);

    JsonResult deleteById(Integer collegeId);

    JsonResult add(College college);

    JsonResult update(College college);
}
