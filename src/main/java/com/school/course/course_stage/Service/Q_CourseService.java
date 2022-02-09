package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.Course;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseExample;

import java.util.List;

public interface Q_CourseService {

    List<Course> getAll();

    int insert(Course course);

    int update(Course course);

    int deleteById(int id);

    List<Course> select(Course course);

    Course getById(int id );


}
