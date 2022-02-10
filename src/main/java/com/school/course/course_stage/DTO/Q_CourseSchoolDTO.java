package com.school.course.course_stage.DTO;

import java.util.List;

public class Q_CourseSchoolDTO {

    private String token ;
    private String role ;

    private List<Integer> ids ;

    private Integer schoolId ;
    private String schoolName ;

    private Integer courseId ;
    private String courseName ;

    private Integer courseSchoolId ;

    private Integer id ;

    private String adaptTime ;

    private Integer setId ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSetId() {
        return setId;
    }

    public void setSetId(Integer setId) {
        this.setId = setId;
    }

    public String getAdaptTime() {
        return adaptTime;
    }

    public void setAdaptTime(String adaptTime) {
        this.adaptTime = adaptTime;
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

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseSchoolId() {
        return courseSchoolId;
    }

    public void setCourseSchoolId(Integer courseSchoolId) {
        this.courseSchoolId = courseSchoolId;
    }
}
