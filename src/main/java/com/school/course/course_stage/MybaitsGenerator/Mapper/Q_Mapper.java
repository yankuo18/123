package com.school.course.course_stage.MybaitsGenerator.Mapper;

import com.school.course.course_stage.DTO.Q_CourseSchoolDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.Course;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface Q_Mapper {


    /**
     * 因该是 VO，但我懒
     * @param schoolId
     * @return
     */
    List<Q_CourseSchoolDTO> getBySchoolId(Integer schoolId);

    List<Q_CourseSchoolDTO> getBySchoolIdAndLike(@Param("school") Integer schoolId ,@Param("name") String name);




//
//
//
//
//    long countByExample(CourseExample example);
//
//
//    int deleteByExample(CourseExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//
//    int insert(Course record);
//
//
//    int insertSelective(Course record);
//
//
//    List<Course> selectByExample(CourseExample example);
//
//    Course selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);
//
//
//    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);
//
//
//    int updateByPrimaryKeySelective(Course record);
//
//
//    int updateByPrimaryKey(Course record);
}