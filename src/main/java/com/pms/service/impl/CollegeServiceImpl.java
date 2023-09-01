package com.pms.service.impl;

import com.pms.dao.CollegeMapper;
import com.pms.dao.CourseMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.College;
import com.pms.pojo.CollegeExample;
import com.pms.pojo.Course;
import com.pms.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/3.
 */
@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeMapper collegeMapper;


    @Override
    public List<College> finAll() {
        return collegeMapper.selectByExample(new CollegeExample());
    }

    @Override
    public College findById(Integer collegeId) {
        if(collegeId == null) return null;
        return collegeMapper.selectByPrimaryKey(collegeId);
    }

    @Override
    public JsonResult deleteById(Integer collegeId) {
        if(collegeId == null) return new JsonResult(false,"删除失败！空指针异常!");
        int i = collegeMapper.deleteByPrimaryKey(collegeId);
        return i > 0 ? new JsonResult(true,"删除成功!") :
                new JsonResult(false,"删除失败!");
    }

    @Override
    public JsonResult add(College college) {
        if(college == null) return new JsonResult(false,"添加失败!空指针异常!");
        college.setCollegeCreatetime(new Date());
        int i = collegeMapper.insertSelective(college);
        return i > 0 ? new JsonResult(true,"添加成功!"):
                new JsonResult(false,"添加失败!");
    }

    @Override
    public JsonResult update(College college) {
        if(college == null  || college.getCollegeId() == null) return new JsonResult(false,"更新失败!空指针异常!");
        college.setCollegeCreatetime(new Date());
        int i = collegeMapper.updateByPrimaryKeySelective(college);
        return i > 0 ? new JsonResult(true,"更新成功!"):
                new JsonResult(false,"更新失败!");
    }


}
