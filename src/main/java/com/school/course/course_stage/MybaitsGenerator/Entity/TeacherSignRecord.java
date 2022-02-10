package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;
import java.util.Date;

public class TeacherSignRecord implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_sign_in.teacher_name
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_sign_in.sign_in_time
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    private Date signInTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_sign_in.sign_in_status
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    private Integer signInStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_sign_in.id
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_sign_in.course_time
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    private String courseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_sign_in.course_name
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    private String courseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_sign_in.teacher_name
     *
     * @return the value of teacher_sign_in.teacher_name
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_sign_in.teacher_name
     *
     * @param teacherName the value for teacher_sign_in.teacher_name
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_sign_in.sign_in_time
     *
     * @return the value of teacher_sign_in.sign_in_time
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public Date getSignInTime() {
        return signInTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_sign_in.sign_in_time
     *
     * @param signInTime the value for teacher_sign_in.sign_in_time
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public void setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_sign_in.sign_in_status
     *
     * @return the value of teacher_sign_in.sign_in_status
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public Integer getSignInStatus() {
        return signInStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_sign_in.sign_in_status
     *
     * @param signInStatus the value for teacher_sign_in.sign_in_status
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public void setSignInStatus(Integer signInStatus) {
        this.signInStatus = signInStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_sign_in.id
     *
     * @return the value of teacher_sign_in.id
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_sign_in.id
     *
     * @param id the value for teacher_sign_in.id
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_sign_in.course_time
     *
     * @return the value of teacher_sign_in.course_time
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public String getCourseTime() {
        return courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_sign_in.course_time
     *
     * @param courseTime the value for teacher_sign_in.course_time
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_sign_in.course_name
     *
     * @return the value of teacher_sign_in.course_name
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_sign_in.course_name
     *
     * @param courseName the value for teacher_sign_in.course_name
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_sign_in
     *
     * @mbg.generated Tue Feb 08 21:55:22 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherName=").append(teacherName);
        sb.append(", signInTime=").append(signInTime);
        sb.append(", signInStatus=").append(signInStatus);
        sb.append(", id=").append(id);
        sb.append(", courseTime=").append(courseTime);
        sb.append(", courseName=").append(courseName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}