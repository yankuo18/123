package com.school.course.course_stage.MybaitsGenerator.Mapper;

import com.school.course.course_stage.MybaitsGenerator.Entity.RoleMenu;
import com.school.course.course_stage.MybaitsGenerator.Entity.RoleMenuExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    long countByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int deleteByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int insert(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int insertSelective(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    List<RoleMenu> selectByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    RoleMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int updateByPrimaryKeySelective(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    int updateByPrimaryKey(RoleMenu record);
}