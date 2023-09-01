package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.pojo.Paper;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Ming on 2018/3/2.
 */
public interface PaperService {

    JsonResult update(Paper paper);

    //add
    JsonResult add(Paper paper);

    Paper findAllById(Integer paperId);

    List<Paper> findPaperByStuId(Integer stuId);

    JsonResult studentSubmitPaper(Paper paper, MultipartFile paperFile, HttpServletRequest request);

    JsonResult teacherSubmitPaper(Paper paper, MultipartFile paperFile, HttpServletRequest request);

    List<Paper> findPaperByTeacherId(Integer teacherId);
}
