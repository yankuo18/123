package com.school.course.course_stage.DTO;

import java.util.List;

public class Q_SchoolUserDeleteSomeDTO {

    private String role ;
    private String token ;
    private List<Integer> ids ;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
