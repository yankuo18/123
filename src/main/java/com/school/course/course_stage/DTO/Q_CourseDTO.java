package com.school.course.course_stage.DTO;

import com.school.course.course_stage.MybaitsGenerator.Entity.Course;

import java.util.List;

public class Q_CourseDTO {

    private Integer id;
    private String name;
    private Integer typeCourseId;

    private String typeCourse ;

    private Integer numberClass;
    private String adaptLevel;
    private Integer typeCourseClassId;

    private String typeCourseClass ;

    private Float price;

    private String detail;

    private List<Integer> ids ;




    private String role;
    private String token ;

    public Course toEntity(){
        Course course = new Course();
        course.setId(id);
        course.setName(name);
        course.setTypeCourseId(typeCourseId);
        course.setNumberClass(numberClass);
        course.setAdaptLevel(adaptLevel);
        course.setTypeCourseClassId(typeCourseClassId);
        course.setPrice(price);
        course.setDetail(detail);
        return course;
    }


    public Q_CourseDTO(){};

    public Q_CourseDTO(Course course,String typeCourse, String typeCourseClass) {
        this.typeCourse = typeCourse;
        this.typeCourseClass = typeCourseClass;
        this.id = course.getId();
        this.name = course.getName();
        this.typeCourseClassId = course.getTypeCourseClassId();
        this.typeCourseId = course.getTypeCourseId();
        this.numberClass = course.getNumberClass();
        this.adaptLevel = course.getAdaptLevel();
        this.price = course.getPrice();
        this.detail = course.getDetail();
    }

    @Override
    public String toString() {
        return "Q_CourseDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeCourseId=" + typeCourseId +
                ", typeCourse='" + typeCourse + '\'' +
                ", numberClass=" + numberClass +
                ", adaptLevel='" + adaptLevel + '\'' +
                ", typeCourseClassId=" + typeCourseClassId +
                ", typeCourseClass='" + typeCourseClass + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", ids=" + ids +
                ", role='" + role + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public String getTypeCourse() {
        return typeCourse;
    }

    public void setTypeCourse(String typeCourse) {
        this.typeCourse = typeCourse;
    }

    public String getTypeCourseClass() {
        return typeCourseClass;
    }

    public void setTypeCourseClass(String typeCourseClass) {
        this.typeCourseClass = typeCourseClass;
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

    public Integer getTypeCourseId() {
        return typeCourseId;
    }

    public void setTypeCourseId(Integer typeCourseId) {
        this.typeCourseId = typeCourseId;
    }

    public Integer getNumberClass() {
        return numberClass;
    }

    public void setNumberClass(Integer numberClass) {
        this.numberClass = numberClass;
    }

    public String getAdaptLevel() {
        return adaptLevel;
    }

    public void setAdaptLevel(String adaptLevel) {
        this.adaptLevel = adaptLevel;
    }

    public Integer getTypeCourseClassId() {
        return typeCourseClassId;
    }

    public void setTypeCourseClassId(Integer typeCourseClassId) {
        this.typeCourseClassId = typeCourseClassId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
}
