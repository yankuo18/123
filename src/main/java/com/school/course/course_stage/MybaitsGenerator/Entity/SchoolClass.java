package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;

public class SchoolClass implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column school_class.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column school_class.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column school_class.nums_student
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer numsStudent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column school_class.max_student
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer maxStudent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table school_class
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_class.id
     *
     * @return the value of school_class.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_class.id
     *
     * @param id the value for school_class.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_class.name
     *
     * @return the value of school_class.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_class.name
     *
     * @param name the value for school_class.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_class.nums_student
     *
     * @return the value of school_class.nums_student
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getNumsStudent() {
        return numsStudent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_class.nums_student
     *
     * @param numsStudent the value for school_class.nums_student
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setNumsStudent(Integer numsStudent) {
        this.numsStudent = numsStudent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column school_class.max_student
     *
     * @return the value of school_class.max_student
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getMaxStudent() {
        return maxStudent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column school_class.max_student
     *
     * @param maxStudent the value for school_class.max_student
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setMaxStudent(Integer maxStudent) {
        this.maxStudent = maxStudent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table school_class
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
        sb.append(", numsStudent=").append(numsStudent);
        sb.append(", maxStudent=").append(maxStudent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}