package com.school.course.course_stage.VO;

import java.util.Date;

/**
 * @ClassName UserParentsVo
 * @Description 家长Vo类
 * @date 2022/2/9 17:33
 * @Author Rosinante
 * @Version 1.0
 */
public class UserParentsVo {
    private Integer id;
    private String name;
    private String account;
    private Integer schoolId;
    private String school;
    private String grade;
    private String role;
    private String phone;
    private String image;
    private Byte status;
    private String token;
    private String remark;
    private Date createAt;
    private Date updateAt;
    private Date deleteAt;

    public UserParentsVo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "UserParentsVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", schoolId=" + schoolId +
                ", school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                ", role='" + role + '\'' +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                ", status=" + status +
                ", token='" + token + '\'' +
                ", remark='" + remark + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", deleteAt=" + deleteAt +
                '}';
    }
}
