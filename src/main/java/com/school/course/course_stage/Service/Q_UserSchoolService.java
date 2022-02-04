package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;

public interface Q_UserSchoolService {

    UserSchool getByAccount(String account) ;

    int update(UserSchool userSchool);

    String login(String account , String password );


}
