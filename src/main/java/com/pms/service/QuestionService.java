package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Question;

import java.util.List;

/**
 * Created by Ming on 2018/2/28.
 */
public interface QuestionService {

    List<Question> findAll();

    List<Question> getRandomList(Integer courseId);

    JsonResult add(Question question);

    JsonResult update(Question question);

    JsonResult deleteById(Integer queId);

    Question findById(Integer queId);
}
