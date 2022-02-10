package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.TeachCourse;
import com.school.course.course_stage.MybaitsGenerator.Entity.TeachCourseExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.TeachCourseMapper;
import com.school.course.course_stage.Service.F_teachCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class F_teachCourseServiceImpl implements F_teachCourseService{


    @Resource
    private TeachCourseMapper teachCourseMapper;

    @Override
        public List<TeachCourse> getCourses(String username) {
            TeachCourseExample teachCourseExample = new TeachCourseExample();
            teachCourseExample.or().andTeacherNameEqualTo(username);
            List<TeachCourse> teachCourses = teachCourseMapper.selectByExample(teachCourseExample);
            return teachCourses;
        }
}
