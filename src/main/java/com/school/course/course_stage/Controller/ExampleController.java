package com.school.course.course_stage.Controller;

import com.school.course.course_stage.Service.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("example")
public class ExampleController {

    @Autowired
    Example example ;


    /**
     *  example 由上面 自动注入对象，  通过访问 /example/example 获取输出
     */
    @RequestMapping("/example")
    @ResponseBody
    public String example(){

        int a = 0 ;
        return example.example();
    }


}
