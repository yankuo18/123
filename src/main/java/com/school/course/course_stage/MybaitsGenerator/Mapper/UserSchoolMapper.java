package com.school.course.course_stage.MybaitsGenerator.Mapper;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchoolExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserSchoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    long countByExample(UserSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int deleteByExample(UserSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int insert(UserSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int insertSelective(UserSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    List<UserSchool> selectByExample(UserSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    UserSchool selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int updateByExampleSelective(@Param("record") UserSchool record, @Param("example") UserSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int updateByExample(@Param("record") UserSchool record, @Param("example") UserSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int updateByPrimaryKeySelective(UserSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_school
     *
     * @mbg.generated Sun Feb 06 11:09:18 CST 2022
     */
    int updateByPrimaryKey(UserSchool record);
}