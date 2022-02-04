package com.school.course.course_stage.Controller;


import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_SchoolTypeService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/q_schoolType")
public class Q_SchoolTypeController {

    @Resource
    private Q_AuthorityService q_authorityService;

    @Resource
    private Q_SchoolTypeService q_schoolTypeService;


    @RequestMapping("/all")
    public Map<String,Object> getAllSchoolType(@RequestParam("token") String token , @RequestParam("role")  String role){

        if (!q_authorityService.authority(role,token,"/q_schoolType/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");


        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",q_schoolTypeService.getAll());
    }


    @RequestMapping("/add")
    public Map<String,Object> addSchoolType(@RequestParam("token")String token , @RequestParam("role")String role, @RequestParam("name")String name, @RequestParam("remark")String remark){

        if (!q_authorityService.authority(role,token,"/q_schoolType/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_schoolTypeService.insert(name,remark) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"添加成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"添加失败");
    }





}
