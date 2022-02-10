package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.TeacherSignRecord;

import java.util.List;

public interface F_teacherSignInService {
    List<TeacherSignRecord> getTeacherSignRecord(String username,String courseTime,String courseName);

    int insert(TeacherSignRecord insertTeacherSign);
}
