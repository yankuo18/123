package com.school.course.course_stage.Controller;

import com.school.course.course_stage.Service.Q_SystemMenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/q_menu")
public class Q_MenuController {


    @Resource
    private Q_SystemMenuService q_systemMenuService ;

    @RequestMapping("/menu_index/{role}")
    @ResponseBody
    public Map<String,Object> menuIndex(@PathVariable("role") String role ){

        return q_systemMenuService.menuIndex(role);
    }









}
