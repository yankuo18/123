package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;

public class TypeCourseClass implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_course_class.id
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_course_class.name
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_course_class.remark
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table type_course_class
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_course_class.id
     *
     * @return the value of type_course_class.id
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_course_class.id
     *
     * @param id the value for type_course_class.id
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_course_class.name
     *
     * @return the value of type_course_class.name
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_course_class.name
     *
     * @param name the value for type_course_class.name
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_course_class.remark
     *
     * @return the value of type_course_class.remark
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_course_class.remark
     *
     * @param remark the value for type_course_class.remark
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_course_class
     *
     * @mbg.generated Mon Feb 07 19:47:10 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}