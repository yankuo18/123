package com.school.course.course_stage.MybaitsGenerator.Mapper;

import com.school.course.course_stage.MybaitsGenerator.Entity.TeacherSignRecord;
import com.school.course.course_stage.MybaitsGenerator.Entity.TeacherSignRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherSignRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    long countByExample(TeacherSignRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    int deleteByExample(TeacherSignRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    int insert(TeacherSignRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    int insertSelective(TeacherSignRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    List<TeacherSignRecord> selectByExample(TeacherSignRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    int updateByExampleSelective(@Param("record") TeacherSignRecord record, @Param("example") TeacherSignRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    int updateByExample(@Param("record") TeacherSignRecord record, @Param("example") TeacherSignRecordExample example);
}