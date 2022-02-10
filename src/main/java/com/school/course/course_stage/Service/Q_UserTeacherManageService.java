package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherManage;

import java.util.List;

public interface Q_UserTeacherManageService {

    UserTeacherManage getByAccount(String account) ;

    UserTeacherManage getById(int id );

    List<UserTeacherManage> getAll();

    List<UserTeacherManage> getBySchool(int schoolId);

    int insert(UserTeacherManage userTeacherTeache);

    int deleteById(int id);

    int update(UserTeacherManage userTeacherTeache);


    List<UserTeacherManage> select(UserTeacherManage userTeacherTeache);


}
