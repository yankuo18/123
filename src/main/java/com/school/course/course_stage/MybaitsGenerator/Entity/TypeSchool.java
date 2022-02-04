package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;
import java.util.Date;

public class TypeSchool implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_school.id
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_school.name
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_school.remark
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_school.create_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_school.update_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type_school.delete_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    private Date deleteAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table type_school
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_school.id
     *
     * @return the value of type_school.id
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_school.id
     *
     * @param id the value for type_school.id
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_school.name
     *
     * @return the value of type_school.name
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_school.name
     *
     * @param name the value for type_school.name
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_school.remark
     *
     * @return the value of type_school.remark
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_school.remark
     *
     * @param remark the value for type_school.remark
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_school.create_at
     *
     * @return the value of type_school.create_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_school.create_at
     *
     * @param createAt the value for type_school.create_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_school.update_at
     *
     * @return the value of type_school.update_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_school.update_at
     *
     * @param updateAt the value for type_school.update_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type_school.delete_at
     *
     * @return the value of type_school.delete_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public Date getDeleteAt() {
        return deleteAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type_school.delete_at
     *
     * @param deleteAt the value for type_school.delete_at
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
     */
    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table type_school
     *
     * @mbg.generated Fri Feb 04 21:21:31 CST 2022
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
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", deleteAt=").append(deleteAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}