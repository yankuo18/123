package com.school.course.course_stage.MybaitsGenerator.Mapper;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserParents;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserParentsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserParentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    long countByExample(UserParentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int deleteByExample(UserParentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int insert(UserParents record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int insertSelective(UserParents record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    List<UserParents> selectByExample(UserParentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    UserParents selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int updateByExampleSelective(@Param("record") UserParents record, @Param("example") UserParentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int updateByExample(@Param("record") UserParents record, @Param("example") UserParentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int updateByPrimaryKeySelective(UserParents record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_parents
     *
     * @mbg.generated Wed Feb 09 17:17:05 CST 2022
     */
    int updateByPrimaryKey(UserParents record);

}