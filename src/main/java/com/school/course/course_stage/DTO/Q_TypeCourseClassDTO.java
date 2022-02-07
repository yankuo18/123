package com.school.course.course_stage.DTO;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseClass;

import java.util.List;

public class Q_TypeCourseClassDTO {


    private Integer id ;
    private String name;
    private String remark;
    private String token ;
    private String role ;
    private List<Integer> ids;


    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public TypeCourseClass toEntity(){
        TypeCourseClass typeCourseClass = new TypeCourseClass();

        typeCourseClass.setId(this.id);
        typeCourseClass.setName(this.name);
        typeCourseClass.setRemark(this.remark);

        return typeCourseClass;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
