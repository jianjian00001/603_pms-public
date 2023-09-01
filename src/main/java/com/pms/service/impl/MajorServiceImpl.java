package com.pms.service.impl;

import com.pms.dao.MajorMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.Major;
import com.pms.pojo.MajorExample;
import com.pms.service.CollegeService;
import com.pms.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/3.
 */
@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;

    @Autowired
    private CollegeService collegeService;
    @Override
    public Major findAllById(Integer majorId) {
        if(majorId == null) return null;
        return majorMapper.selectByPrimaryKey(majorId);
    }

    @Override
    public List<Major> findAll () {
        List<Major> majors = majorMapper.selectByExample(new MajorExample());
        for (Major major : majors) {
            major.setCollege(collegeService.findById(major.getCollegeId()));
        }
        return majors;
    }


    @Override
    public JsonResult add(Major major) {
        if(major == null) return new JsonResult(false,"添加失败!空指针异常!");
        major.setMajorCreatetime(new Date());
        int i = majorMapper.insertSelective(major);
        return i > 0 ? new JsonResult(true,"添加专业成功!"):
                new JsonResult(false,"添加专业失败!");
    }

    @Override
    public JsonResult update(Major major) {
        if(major == null  || major.getMajorId() == null) return new JsonResult(false,"更新失败!空指针异常!");
        major.setMajorUpdatetime(new Date());
        int i = majorMapper.updateByPrimaryKeySelective(major);
        return i > 0 ? new JsonResult(true,"更新专业成功!"):
                new JsonResult(false,"更新专业失败!");
    }

    @Override
    public JsonResult deleteById(Integer majorId) {
        if(majorId == null) return new JsonResult(false,"删除失败!");
        return majorMapper.deleteByPrimaryKey(majorId) > 0 ?
                new JsonResult(true,"删除成功!"):
                new JsonResult(false,"删除失败!");
    }

}
