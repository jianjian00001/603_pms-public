package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Project;

import java.util.List;

/**
 * Created by Ming on 2018/3/2.
 */
public interface ProjectService {

    JsonResult addProject(Project project);

    JsonResult updateProject(Project project);

    JsonResult deleteProject(Integer projectId);

    Project findAllById(Integer projectId);

    List<Project> findAllByTeacherId(Integer teacherId);

    List<Project> findAll();
}
