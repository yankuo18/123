package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserAdmin;

public interface Q_UserAdminService {

    UserAdmin getByAccount(String account);

    int update(UserAdmin userAdmin) ;

    String login(String account, String password);

    boolean haveToken(String token);


}
