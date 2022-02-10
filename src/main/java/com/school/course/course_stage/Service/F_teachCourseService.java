package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.TeachCourse;
import java.util.List;

public interface F_teachCourseService {
    List<TeachCourse> getCourses(String username);
}
