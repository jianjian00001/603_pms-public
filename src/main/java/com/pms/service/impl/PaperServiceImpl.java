package com.pms.service.impl;

import com.pms.dao.AdminMapper;
import com.pms.dao.PaperMapper;
import com.pms.dao.StudentMapper;
import com.pms.dao.TeacherMapper;
import com.pms.dto.JsonResult;
import com.pms.pojo.Paper;
import com.pms.pojo.PaperExample;
import com.pms.pojo.Student;
import com.pms.pojo.Teacher;
import com.pms.service.PaperService;
import com.pms.utils.DateUtil;
import com.pms.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by Ming on 2018/3/2.
 */
@Service
public class PaperServiceImpl implements PaperService {


    @Autowired
    private PaperMapper paperMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public JsonResult update(Paper paper) {
        if(paper == null) return new JsonResult(false,"更新失败!");
        paper.setPaperUpdatetime(new Date());
        int i = paperMapper.updateByPrimaryKeySelective(paper);
        return i > 0 ? new JsonResult(true,"更新成功!"):
                new JsonResult(false,"更新失败！");
    }

    //add
    @Override
    public JsonResult add(Paper paper) {
        if(paper == null) return new JsonResult(false,"添加失败!");
        paper.setPaperCreatetime(new Date());
        paper.setPaperUpdatetime(new Date());
        PaperExample paperExample = new PaperExample();
        paperExample.createCriteria().andStuIdEqualTo(paper.getStuId()).andProjectIdEqualTo(paper.getProjectId());
        List<Paper> papers = paperMapper.selectByExample(paperExample);
        if(papers != null && papers.size() > 0) return new JsonResult(false,"添加失败！重复添加");
        int i = paperMapper.insertSelective(paper);
        return i > 0 ? new JsonResult(true,"添加成功!"):
                new JsonResult(false,"添加失败！");
    }

    @Override
    public Paper findAllById(Integer paperId) {
        if(paperId == null) return null;
        return paperMapper.selectByPrimaryKey(paperId);
    }


    @Override
    public JsonResult studentSubmitPaper(Paper paper, MultipartFile paperFile, HttpServletRequest request) {
        if(paper == null || paperFile.isEmpty()) return new JsonResult(false,"上传失败！你传的为空！");
        String path = FileUtil.upload(paperFile, "student-paper", request);
        if(path == null) return new JsonResult(false,"上传失败！");
        paper.setStudentPath(path);
        paper.setStudentUploadtime(DateUtil.yMdHmsToStr(new Date()));
        paper.setPaperUpdatetime(new Date());
        int i = paperMapper.updateByPrimaryKeySelective(paper);
        return  i > 0 ? new JsonResult(true,"上传成功！"):
                new JsonResult(false,"上传失败!");
    }

    @Override
    public JsonResult teacherSubmitPaper(Paper paper, MultipartFile paperFile,HttpServletRequest request) {
        if(paper == null || paperFile.isEmpty()) return new JsonResult(false,"上传失败！你传的为空！");
        String path = FileUtil.upload(paperFile, "teacher-paper", request);
        if(path == null) return new JsonResult(false,"上传失败！");
        paper.setTeacherPath(path);
        paper.setPaperFlag(1);//0 老师未批改 1老师已批改
        paper.setTeacherUploadtime(DateUtil.yMdHmsToStr(new Date()));
        paper.setPaperUpdatetime(new Date());
        int i = paperMapper.updateByPrimaryKeySelective(paper);
        return  i > 0 ? new JsonResult(true,"上传成功！"):
                new JsonResult(false,"上传失败!");
    }


    //todo 可以sql 优化
    @Override
    public List<Paper> findPaperByStuId(Integer stuId) {
        if(stuId != null) {
            PaperExample paperExample = new PaperExample();
            paperExample.createCriteria().andStuIdEqualTo(stuId);
            List<Paper> papers = paperMapper.selectByExample(paperExample);
            if(papers != null && papers.size() > 0){
                for (Paper paper : papers) {
                    Teacher teacher = teacherMapper.selectByPrimaryKey(paper.getTeacherId());
                    paper.setTeacher(teacher);
                }
            }
            return papers;
        }
        return null;
    }



    @Override
    public List<Paper> findPaperByTeacherId(Integer teacherId) {
        if(teacherId != null) {
            PaperExample paperExample = new PaperExample();
            paperExample.createCriteria().andTeacherIdEqualTo(teacherId);
            List<Paper> papers = paperMapper.selectByExample(paperExample);
            if(papers != null && papers.size() > 0){
                for (Paper paper : papers) {
                    Student student = studentMapper.selectByPrimaryKey(paper.getStuId());
                    paper.setStudent(student);
                }
            }
            return papers;
        }
        return null;
    }


}
