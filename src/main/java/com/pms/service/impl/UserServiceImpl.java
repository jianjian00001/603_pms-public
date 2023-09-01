package com.pms.service.impl;

import com.pms.dao.AdminMapper;
import com.pms.dao.StudentMapper;
import com.pms.dao.TeacherMapper;
import com.pms.dto.JsonResult;
import com.pms.dto.User;
import com.pms.pojo.*;
import com.pms.service.UserService;
import com.pms.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/2/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private AdminMapper adminMapper;



    @Override
    public Object checkLogin(User user) {
           if("学生".equals(user.getRole())){
               StudentExample studentExample = new StudentExample();
               studentExample.createCriteria().andStuNoEqualTo(user.getUsername());
               List<Student> students = studentMapper.selectByExample(studentExample);
               if(students != null && students.size() > 0){
                   Student student = students.get(0);
                   if(student.getStuPassword().equals(user.getPassword())){
                       //正确设置登陆密码 和改用户的id
                       user.setLastLoginTime(student.getStuLogintime())  ;
                       user.setUid(student.getStuId());
                       user.setRealname(student.getStuName());
                       //更新student登陆时间
                       Student updateStu = new Student();
                       updateStu.setStuId(student.getStuId());
                       updateStu.setStuLogintime(DateUtil.yMdHmsToStr(new Date()));
                       updateStu.setStuUpdatetime(new Date());
                       studentMapper.updateByPrimaryKeySelective(updateStu);
                       return user;
                   }else return "密码错误!";
               }else return "没有此用户!";
           }else if("老师".equals(user.getRole())){
               TeacherExample teacherExample = new TeacherExample();
               teacherExample.createCriteria().andTeacherNoEqualTo(user.getUsername());
               List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
               if(teachers != null && teachers.size() >0){
                   Teacher teacher = teachers.get(0);
                   if(teacher.getTeacherPassword().equals(user.getPassword())){
                       //正确设置登陆密码 和改用户的id
                       user.setUid(teacher.getTeacherId());
                       user.setLastLoginTime(teacher.getTeacherLogintime());
                       user.setRealname(teacher.getTeacherName());
                       //更新teacher登陆时间
                       Teacher updateTeacher = new Teacher();
                       updateTeacher.setTeacherId(teacher.getTeacherId());
                       updateTeacher.setTeacherUpdatetime(new Date());
                       updateTeacher.setTeacherLogintime(DateUtil.yMdHmsToStr(new Date()));
                       teacherMapper.updateByPrimaryKeySelective(updateTeacher);
                       return user;
                   }else return "密码错误!";
               }else return "没有此用户!";
           }else if("管理员".equals(user.getRole())){
               AdminExample adminExample = new AdminExample();
               adminExample.createCriteria().andAdminAccountEqualTo(user.getUsername());
               List<Admin> admins = adminMapper.selectByExample(adminExample);
               if(admins != null && admins.size() > 0){
                   Admin admin = admins.get(0);
                   if(admin.getAdminPassword().equals(user.getPassword())){
                       user.setRealname(admin.getAdminName());
                       user.setUid(admin.getAdminId());
                       return user;
                   }else return "密码错误!";
               }else return "没有此用户!";
           }else return "没有此用户!";


    }

    @Override
    public JsonResult updatePassword(User user, String oldPwd, String newPwd) {
        if(user == null || oldPwd == null || newPwd == null) return new JsonResult(false,"更新密码失败!");
        if("学生".equals(user.getRole())){
            Student student = studentMapper.selectByPrimaryKey(user.getUid());
            if(student == null) return new JsonResult(false,"没有此用户!");
            if(oldPwd.equals(student.getStuPassword())){
                student.setStuPassword(newPwd);
                student.setStuUpdatetime(new Date());
                int i = studentMapper.updateByPrimaryKeySelective(student);
                return i > 0 ? new JsonResult(true,"更新密码成功!"):
                        new JsonResult(false,"更新密码失败!");
            }else return new JsonResult(false,"旧密码输入错误");
        }else if("老师".equals(user.getRole())){
            Teacher teacher = teacherMapper.selectByPrimaryKey(user.getUid());
            if(teacher == null) return new JsonResult(false,"没有此用户!");
            if(oldPwd.equals(teacher.getTeacherPassword())){
                teacher.setTeacherPassword(newPwd);
                teacher.setTeacherUpdatetime(new Date());
                int i = teacherMapper.updateByPrimaryKeySelective(teacher);
                return i > 0 ? new JsonResult(true,"更新密码成功!"):
                        new JsonResult(false,"更新密码失败!");
            }else return new JsonResult(false,"旧密码输入错误");
        }else if("管理员".equals(user.getRole())){
            Admin admin = adminMapper.selectByPrimaryKey(user.getUid());
            if(admin == null) return new JsonResult(false,"没有此用户!");
            if(oldPwd.equals(admin.getAdminPassword())){
                admin.setAdminPassword(newPwd);
                admin.setAdminUpdatetime(new Date());
                int i = adminMapper.updateByPrimaryKeySelective(admin);
                return i > 0 ? new JsonResult(true,"更新密码成功!"):
                        new JsonResult(false,"更新密码失败!");
            }else return new JsonResult(false,"旧密码输入错误");
        }
        return new JsonResult(false,"更新密码失败!");
    }
}
