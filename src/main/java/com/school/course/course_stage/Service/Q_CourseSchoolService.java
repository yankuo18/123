package com.school.course.course_stage.Service;

import com.school.course.course_stage.DTO.Q_CourseSchoolDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.Course;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseSchool;

import java.util.List;

public interface Q_CourseSchoolService {

    List<CourseSchool> getAll();


    List<CourseSchool> getBySchoolId(int id) ;

    int insert(CourseSchool courseSchool);

    int deleteById(int schoolId );

    int update(CourseSchool courseSchool);


    List<CourseSchool> select(CourseSchool courseSchool);

    List<Q_CourseSchoolDTO> getDTOs(int schoolId);



    List<Q_CourseSchoolDTO> getDTOsByLike(int schoolId , String name);


    List<Q_CourseSchoolDTO> toDTO(List<Course> courses);

    boolean checkByCourseAndSchool(int courseId , int schoolId);


}
