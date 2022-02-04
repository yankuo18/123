package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;

public class Course implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.type_course_id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer typeCourseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.type_course_id
     *
     * @return the value of course.type_course_id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getTypeCourseId() {
        return typeCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.type_course_id
     *
     * @param typeCourseId the value for course.type_course_id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setTypeCourseId(Integer typeCourseId) {
        this.typeCourseId = typeCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", typeCourseId=").append(typeCourseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}