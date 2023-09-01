package com.pms.service.impl;

import com.pms.dao.*;
import com.pms.dto.JsonResult;
import com.pms.dto.StuAndTestAndCourseAndMajor;
import com.pms.pojo.*;
import com.pms.service.TestService;
import com.pms.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/2/28.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private MultiTableMapper multiTableMapper;

    @Transactional
    //录入成绩
    @Override
    public JsonResult importReplay(String replay, Student student) {
        try{
            if(replay == null || student == null) return new JsonResult(false,"提交失败");
            Test test = new Test();
            int score = 0;
            int courseId = 0;
            String[] value = replay.split("#");
            for (String s : value) {
                String[] idAndReplay = s.split("-");
                Question question = questionMapper.selectByPrimaryKey(Integer.parseInt(idAndReplay[0]));
                if(question != null && question.getQueAnswer().equals(idAndReplay[1]))
                    if(courseId == 0) courseId = question.getCourseId();
                score += question.getQueScore();
            }

            //判断是否重复做一套卷子
            TestExample testExample = new TestExample();
            testExample.createCriteria().andCourseIdEqualTo(courseId).andStuIdEqualTo(student.getStuId());
            List<Test> repeatTest = testMapper.selectByExample(testExample);
            if(repeatTest != null && repeatTest.size() >0) return new JsonResult(false,"提交失败！你做过该课程了！");

            //判断是否做完所有课程
            TestExample testExample1 = new TestExample();
            testExample1.createCriteria().andStuIdEqualTo(student.getStuId());
            int testTimes = testMapper.countByExample(testExample1);//该学生的测试次数
            CourseExample courseExample = new CourseExample();
            courseExample.createCriteria().andMajorIdEqualTo(student.getMajorId());
            int courseCount = courseMapper.countByExample(courseExample);
            if(testTimes == courseCount - 1) { //最后一门则 更新做完所有测试
                Student updateStu = new Student();
                updateStu.setStuId(student.getStuId());
                updateStu.setTestFlag(1);
                updateStu.setStuUpdatetime(new Date());
                studentMapper.updateByPrimaryKeySelective(updateStu);
            }

            //注入test信息
            test.setCourseId(courseId);
            test.setStuId(student.getStuId());
            test.setTestScore(score);
            test.setTestDate(DateUtil.yMdHmsToStr(new Date()));
            test.setTestCreatetime(new Date());
            int i = testMapper.insertSelective(test);
            return i > 0 ? new JsonResult(true,"提交成功！") : new JsonResult(false,"提交失败!");
        }catch (Exception e){
            throw  new RuntimeException(e.getMessage());
        }

    }

    @Override
    public void findTop3Info(Integer stuId, Model model) {

        List<StuAndTestAndCourseAndMajor> top3 = multiTableMapper.findTestTop3ByStuId(stuId);//to3的成绩单

        List<Project> projectList = new ArrayList<>();//推荐的Project
        for (StuAndTestAndCourseAndMajor stc : top3) {
            ProjectExample projectExample = new ProjectExample();
            projectExample.createCriteria().andCourseIdEqualTo(stc.getCourseId());

            List<Project> projects = projectMapper.selectByExample(projectExample);
            for (Project project : projects) {
                Teacher teacher = teacherMapper.selectByPrimaryKey(project.getTeacherId());
                project.setTeacher(teacher);
                projectList.add(project);
            }

        }

        model.addAttribute("projectList",projectList);
        model.addAttribute("to3List",top3);
    }


}
