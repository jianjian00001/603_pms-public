package com.pms.service.impl;

import com.pms.dao.ProjectMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.Course;
import com.pms.pojo.Project;
import com.pms.pojo.ProjectExample;
import com.pms.pojo.Teacher;
import com.pms.service.CourseService;
import com.pms.service.ProjectService;
import com.pms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/2.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private CourseService courseService;

    @Override
    public JsonResult addProject(Project project){
        if(project == null) return new JsonResult(false,"添加课题失败!");
        if(project.getCourseName() == null || project.getCourseId() == null) {
            Teacher teacher = teacherService.findAllById(project.getTeacherId());
            Course course = courseService.findAllById(teacher.getCourseId());
            project.setCourseId(course.getCourseId());
            project.setCourseName(course.getCourseName());
        }
        project.setProjectCreatetime(new Date());
        int i = projectMapper.insertSelective(project);
        return i > 0 ? new JsonResult(true,"添加成功!") :
                new JsonResult(false,"添加失败!");
    }

    @Override
    public JsonResult updateProject(Project project){
        if(project == null || project.getProjectId() == null) return new JsonResult(false,"更新课题失败!");
        project.setProjectUpdatetime(new Date());
        int i = projectMapper.updateByPrimaryKeySelective(project);
        return i > 0 ? new JsonResult(true,"更新成功!") :
                new JsonResult(false,"更新失败!");
    }

    @Override
    public JsonResult deleteProject(Integer projectId){
        if(projectId == null) return new JsonResult(false,"删除课题失败!");
        int i = projectMapper.deleteByPrimaryKey(projectId);
        return i > 0 ? new JsonResult(true,"删除成功!") :
                new JsonResult(false,"删除失败!");
    }

    @Override
    public Project findAllById(Integer projectId) {
        if(projectId == null) return null;
        return projectMapper.selectByPrimaryKey(projectId);
    }

    @Override
    public List<Project> findAllByTeacherId(Integer teacherId) {
        if(teacherId == null) return null;
        ProjectExample projectExample = new ProjectExample();
        projectExample.createCriteria().andTeacherIdEqualTo(teacherId);
        return  projectMapper.selectByExample(projectExample);
    }

    //todo sql 优化
    @Override
    public List<Project> findAll() {
        List<Project> projectList = projectMapper.selectByExample(new ProjectExample());
        for (Project project : projectList) {
            project.setTeacher(teacherService.findAllById(project.getTeacherId()));
        }
        return projectList;
    }
}
