package com.pms.service;

import com.pms.dto.JsonResult;
import com.pms.dto.User;

/**
 * Created by Ming on 2018/2/28.
 */
public interface UserService {

    Object checkLogin(User user);

    JsonResult updatePassword(User user, String oldPwd, String newPwd);
}
