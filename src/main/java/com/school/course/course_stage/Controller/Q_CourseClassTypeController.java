package com.school.course.course_stage.Controller;


import com.school.course.course_stage.DTO.Q_TypeCourseClassDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseClass;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_CourseClassTypeService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/q_courseClassType")
public class Q_CourseClassTypeController {

    @Resource
    private Q_CourseClassTypeService q_courseClassTypeService ;


    @Resource
    private Q_AuthorityService q_authorityService;


    @RequestMapping("/all")
    public Map<String,Object> getAll(@RequestParam("token") String token , @RequestParam("role")  String role){

        if (!q_authorityService.authority(role,token,"/q_courseClassType/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        List<TypeCourseClass> userSchools = q_courseClassTypeService.getAll();

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",userSchools,userSchools.size());
    }


    @RequestMapping("/select")
    public Map<String,Object> select(Q_TypeCourseClassDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_courseClassType/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");


        List<TypeCourseClass> dataList = q_courseClassTypeService.select(dataDTO.toEntity());

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",dataList,dataList.size());

    }


    @RequestMapping("/add")
    public Map<String,Object> add(Q_TypeCourseClassDTO q_typeCourseClassDTO){

        if (!q_authorityService.authority(q_typeCourseClassDTO.getRole(),q_typeCourseClassDTO.getToken(),"/q_courseClassType/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseClassTypeService.insert(q_typeCourseClassDTO.toEntity()) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"添加成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"添加失败");
    }


    @RequestMapping("/update")
    public Map<String,Object> update(Q_TypeCourseClassDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_courseClassType/update"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseClassTypeService.update(dataDTO.toEntity()) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"修改成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"修改失败");
    }


    @RequestMapping("/delete")
    public Map<String,Object> delete(@RequestParam("token")String token , @RequestParam("role")String role, @RequestParam("id")int id){

        if (!q_authorityService.authority(role,token,"/q_courseClassType/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseClassTypeService.deleteById(id) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }


    @RequestMapping("/deleteSome")
    public Map<String,Object> deleteSome(Q_TypeCourseClassDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_courseClassType/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        int length = dataDTO.getIds().size();
        int status = 0 ;

        for (Integer id : dataDTO.getIds()) {
            status += q_courseClassTypeService.deleteById(id);
        }

        if (status == length )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else if (status > 0)
            return new ReturnResult().toMap(ConstAttr.ERROR,"部分删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }






}
