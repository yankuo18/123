package com.school.course.course_stage.Controller;
import com.school.course.course_stage.MybaitsGenerator.Entity.TeacherSignRecord;
import com.school.course.course_stage.Service.F_teacherSignInService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("fr_courseType")
public class F_TeacherSignInController {
    @Resource
    private F_teacherSignInService teacherSignInService;

    /**
     * 进入教师签到页面，显示教师签到记录
     */
//http://localhost:8080/fr_courseType/getTeacherSignRecord?username=赵老师&courseTime=周一、周二
    @GetMapping("/getTeacherSignRecord")
    public List<TeacherSignRecord> getTeacherSignRecord(@RequestParam("username") String username, @RequestParam("courseTime") String courseTime,
                                                        @RequestParam("courseName") String courseName) {
        List<TeacherSignRecord> teacherSignRecord = teacherSignInService.getTeacherSignRecord(username, courseTime, courseName);
        return teacherSignRecord;
    }

    /**
     * 进入教师签到页面，点击上课签到按钮，插入签到记录
     */

    @GetMapping("/insertTeacherSignRecord")
    public List<TeacherSignRecord> insertTeacherSignRecord(@RequestParam("username") String username, @RequestParam("courseTime") String courseTime,
                                                           @RequestParam("courseName") String courseName) {
        TeacherSignRecord insertTeacherSign = new TeacherSignRecord();
        insertTeacherSign.setTeacherName(username);
        insertTeacherSign.setCourseName(courseName);
        insertTeacherSign.setCourseTime(courseTime);
        insertTeacherSign.setSignInStatus(1);
        insertTeacherSign.setSignInTime(new Date());
        int insertStus = teacherSignInService.insert(insertTeacherSign);
        List<TeacherSignRecord> teacherSignRecord = teacherSignInService.getTeacherSignRecord(username, courseTime, courseName);
        return teacherSignRecord;
    }
}
