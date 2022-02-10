package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherTeache;

import java.util.List;

public interface Q_UserTeacherTeacheService {

    UserTeacherTeache getByAccount(String account) ;

    UserTeacherTeache getById(int id );

    List<UserTeacherTeache> getAll();

    List<UserTeacherTeache> getBySchool(int schoolId);

    int insert(UserTeacherTeache userTeacherTeache);

    int deleteById(int id);

    int update(UserTeacherTeache userTeacherTeache);


    List<UserTeacherTeache> select(UserTeacherTeache userTeacherTeache);

}
