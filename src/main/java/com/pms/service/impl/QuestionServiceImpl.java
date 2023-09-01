package com.pms.service.impl;

import com.pms.dao.QuestionMapper;
import com.pms.dao.StudentMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.Question;
import com.pms.pojo.Question;
import com.pms.pojo.QuestionExample;
import com.pms.pojo.Student;
import com.pms.service.CourseService;
import com.pms.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/2/28.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private CourseService courseService;
    //todo sql 优化
    @Override
    public List<Question> findAll() {
        List<Question> questions = questionMapper.selectByExample(new QuestionExample());
        for (Question question : questions) {
            question.setCourse(courseService.findAllById(question.getCourseId()));
        }
        return questions;
    }

    @Override
    public List<Question> getRandomList(Integer courseId) {
        return  questionMapper.getRandomList(courseId);
    }

    @Override
    public JsonResult add(Question question) {
        if(question == null) return new JsonResult(false,"添加失败!空指针异常!");
        question.setQueCreatetime(new Date());
        int i = questionMapper.insertSelective(question);
        return i > 0 ? new JsonResult(true,"添加问题成功!"):
                new JsonResult(false,"添加问题失败!");
    }

    @Override
    public JsonResult update(Question question) {
        if(question == null  || question.getQueId() == null) return new JsonResult(false,"更新失败!空指针异常!");
        question.setQueUpdatetime(new Date());
        int i = questionMapper.updateByPrimaryKeySelective(question);
        return i > 0 ? new JsonResult(true,"更新问题成功!"):
                new JsonResult(false,"更新问题失败!");
    }

    @Override
    public JsonResult deleteById(Integer queId) {

        if(queId == null) return new JsonResult(false,"删除失败!空指针异常");

        return questionMapper.deleteByPrimaryKey(queId) > 0 ?
                new JsonResult(true,"删除成功!") :
                new JsonResult(false,"删除失败！");
    }

    @Override
    public Question findById(Integer queId) {
        if(queId == null) return null;
        return questionMapper.selectByPrimaryKey(queId);
    }

}
