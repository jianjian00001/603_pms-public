package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Student;
import com.pms.pojo.Test;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by Ming on 2018/2/28.
 */
public interface TestService {

     JsonResult importReplay(String replay,Student student);

     //todo 可以优化 写sql
     void findTop3Info(Integer stuId, Model model);
}
