package com.school.course.course_stage.DTO;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourse;

import java.util.List;

public class Q_TyperCourseDTO {

    private Integer id ;
    private String name ;
    private String code ;
    private String token ;
    private String role ;
    private List<Integer> ids ;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public TypeCourse toEntity(){
        TypeCourse typeCourse = new TypeCourse();
        typeCourse.setId(this.id);
        typeCourse.setName(this.name);
        typeCourse.setCode(this.code);
        return typeCourse;
    }

}
