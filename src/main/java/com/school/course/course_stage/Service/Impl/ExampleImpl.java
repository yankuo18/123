package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.Service.Example;
import org.springframework.stereotype.Service;


@Service
public class ExampleImpl implements Example {

    /*
    接口的实现类
     */


    @Override
    public String example() {
        return "hello world";
    }
}
