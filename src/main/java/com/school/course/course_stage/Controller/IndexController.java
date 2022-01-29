package com.school.course.course_stage.Controller;


import com.school.course.course_stage.Service.SysMenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/")
public class IndexController {


    @Resource
    private SysMenuService sysMenuService;

    @GetMapping("/menu")
    public Map<String, Object> menu() {
        return sysMenuService.menu();
    }

    @GetMapping("index.html")
    public String login(){
        return "index";
    }

    @RequestMapping("/page/{route}.html")
    public String anyTest(@PathVariable("route") String route ){

        return "page/"+route;
    }


}
