package com.school.course.course_stage.Controller;
import com.school.course.course_stage.MybaitsGenerator.Entity.TeachCourse;
import com.school.course.course_stage.Service.F_teachCourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 查询当前老师的课程安排
 */

@RestController
@RequestMapping("fr_courseType")
public class F_TeacherController {

    @Resource
    private F_teachCourseService f_teachCourseService;

    @GetMapping("/getTeachCourses")
    public List<TeachCourse> getTeachCourses(@RequestParam("username") String username ){
        List<TeachCourse> coursesList = f_teachCourseService.getCourses(username);
        return coursesList;
    }


}
