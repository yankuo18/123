package com.school.course.course_stage;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.school.course.course_stage.MybaitsGenerator.Mapper")
class CourseStageApplicationTests {

    @Test
    void contextLoads() {

    }

}
