package com.school.course.course_stage.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouterMain {

    @GetMapping("/index")
    public String index(){
        return "index" ;
    }

}
