package com.school.course.course_stage.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterMain {



    @RequestMapping("/")
    public String backToLogin(){

        return "/page/login-3.html";
    }





}
