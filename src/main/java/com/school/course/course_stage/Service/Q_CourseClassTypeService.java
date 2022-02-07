package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseClass;

import java.util.List;

public interface Q_CourseClassTypeService {


    List<TypeCourseClass> getAll();

    int insert(TypeCourseClass typeCourseClass);

    int deleteById(int id);

    int update(TypeCourseClass typeCourseClass);

    List<TypeCourseClass> select(TypeCourseClass typeCourseClass);


}
