package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeSchool;

import java.util.List;

public interface Q_SchoolTypeService {

    List<TypeSchool> getAll();

    int deleteById(int id);

    int update(TypeSchool typeSchool);

    int insert(TypeSchool typeSchool);

    int insert(String name , String remark) ;


}
