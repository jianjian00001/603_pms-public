package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Major;

import java.util.List;

/**
 * Created by Ming on 2018/3/3.
 */
public interface MajorService {

    Major findAllById(Integer majorId);

    List<Major> findAll();

    JsonResult add(Major major);

    JsonResult update(Major major);

    JsonResult deleteById(Integer majorId);

}
