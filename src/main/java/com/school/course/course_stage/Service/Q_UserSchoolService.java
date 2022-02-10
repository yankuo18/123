package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchoolExample;

import java.util.List;

public interface Q_UserSchoolService {

    UserSchool getByAccount(String account) ;

    int update( UserSchool userSchool);

    int deleteById( int id );

    int insert(UserSchool userSchool) ;

    String login(String account , String password );

    List<UserSchool> getAll();


    List<UserSchool> select(UserSchoolExample userSchoolExample);

    UserSchool getById(int id) ;

}
