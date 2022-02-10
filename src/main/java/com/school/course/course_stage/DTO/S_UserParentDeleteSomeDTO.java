package com.school.course.course_stage.DTO;

import java.util.List;

/**
 * @ClassName S_UserParentDeleteSomeDTO
 * @Description TODO
 * @date 2022/2/10 11:43
 * @Author Rosinante
 * @Version 1.0
 */
public class S_UserParentDeleteSomeDTO {

    private String role ;
    private String token ;
    private List<Integer> ids ;

    public S_UserParentDeleteSomeDTO() {
    }

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

    @Override
    public String toString() {
        return "S_UserParentDeleteSomeDTO{" +
                "role='" + role + '\'' +
                ", token='" + token + '\'' +
                ", ids=" + ids +
                '}';
    }
}
