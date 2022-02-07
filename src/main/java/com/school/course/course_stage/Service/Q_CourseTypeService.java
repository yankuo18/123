package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourse;
import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseExample;

import java.util.List;

public interface Q_CourseTypeService {

    List<TypeCourse> getAll();

    int insert(TypeCourse typeCourse);

    int deleteById(int id);

    int update(TypeCourse typeCourse);

    List<TypeCourse> select(TypeCourseExample typeCourseExample);


}
