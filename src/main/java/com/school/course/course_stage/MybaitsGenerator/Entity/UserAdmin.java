package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;
import java.util.Date;

public class UserAdmin implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.account
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.password
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.role
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.phone
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.image
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.status
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.token
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.remark
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.create_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.update_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_admin.delete_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private Date deleteAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_admin
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.id
     *
     * @return the value of user_admin.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.id
     *
     * @param id the value for user_admin.id
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.name
     *
     * @return the value of user_admin.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.name
     *
     * @param name the value for user_admin.name
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.account
     *
     * @return the value of user_admin.account
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.account
     *
     * @param account the value for user_admin.account
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.password
     *
     * @return the value of user_admin.password
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.password
     *
     * @param password the value for user_admin.password
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.role
     *
     * @return the value of user_admin.role
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.role
     *
     * @param role the value for user_admin.role
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.phone
     *
     * @return the value of user_admin.phone
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.phone
     *
     * @param phone the value for user_admin.phone
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.image
     *
     * @return the value of user_admin.image
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.image
     *
     * @param image the value for user_admin.image
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.status
     *
     * @return the value of user_admin.status
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.status
     *
     * @param status the value for user_admin.status
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.token
     *
     * @return the value of user_admin.token
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.token
     *
     * @param token the value for user_admin.token
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.remark
     *
     * @return the value of user_admin.remark
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.remark
     *
     * @param remark the value for user_admin.remark
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.create_at
     *
     * @return the value of user_admin.create_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.create_at
     *
     * @param createAt the value for user_admin.create_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.update_at
     *
     * @return the value of user_admin.update_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.update_at
     *
     * @param updateAt the value for user_admin.update_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_admin.delete_at
     *
     * @return the value of user_admin.delete_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public Date getDeleteAt() {
        return deleteAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_admin.delete_at
     *
     * @param deleteAt the value for user_admin.delete_at
     *
     * @mbg.generated Fri Feb 04 13:59:14 CST 2022
     */
    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_admin
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
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", role=").append(role);
        sb.append(", phone=").append(phone);
        sb.append(", image=").append(image);
        sb.append(", status=").append(status);
        sb.append(", token=").append(token);
        sb.append(", remark=").append(remark);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", deleteAt=").append(deleteAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}