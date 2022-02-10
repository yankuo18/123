package com.school.course.course_stage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.school.course.course_stage.MybaitsGenerator.Mapper")
public class CourseStageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseStageApplication.class, args);
    }

}
