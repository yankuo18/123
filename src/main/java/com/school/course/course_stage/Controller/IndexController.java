package com.school.course.course_stage.Controller;


import com.school.course.course_stage.Service.SysMenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/")
public class IndexController {


    @Resource
    private SysMenuService sysMenuService;

    @GetMapping("menu")
    @ResponseBody
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

    @RequestMapping("/page/table/{route}.html")
    public String anyTestTable(@PathVariable("route") String route ){

        return "page/table/"+route;
    }

}
