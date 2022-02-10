package com.school.course.course_stage.MybaitsGenerator.Mapper;

import com.school.course.course_stage.MybaitsGenerator.Entity.CourseSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseSchoolExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseSchoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    long countByExample(CourseSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int deleteByExample(CourseSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int insert(CourseSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int insertSelective(CourseSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    List<CourseSchool> selectByExample(CourseSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    CourseSchool selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int updateByExampleSelective(@Param("record") CourseSchool record, @Param("example") CourseSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int updateByExample(@Param("record") CourseSchool record, @Param("example") CourseSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int updateByPrimaryKeySelective(CourseSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_school
     *
     * @mbg.generated Thu Feb 10 22:02:58 CST 2022
     */
    int updateByPrimaryKey(CourseSchool record);
}