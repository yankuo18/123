package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.SystemUser;

public interface SysUserService {


    SystemUser getUserInfo(String account);

    boolean isLogin(String account , String password) ;

    int updateUserInfo(SystemUser systemUser) ;


}
