package com.school.course.course_stage.Controller;


import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherTeache;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_UserTeacherTeacheService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/q_userTeache")
public class Q_UserTeacherTeacheController {


    @Resource
    private Q_UserTeacherTeacheService q_userTeacherTeacheService;

    @Resource
    private Q_AuthorityService q_authorityService;


    @RequestMapping("/all")
    public Map<String,Object> getAll(@RequestParam("token") String token , @RequestParam("role")  String role , @RequestParam("schoolId") int schoolId){

        if (!q_authorityService.authority(role,token,"/q_userTeache/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        List<UserTeacherTeache> datas = q_userTeacherTeacheService.getBySchool(schoolId);

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",datas,datas.size());
    }
//
//    @RequestMapping("/get")
//    public Map<String,Object> get(@RequestParam("token") String token , @RequestParam("role")  String role, @RequestParam("id")  int id){
//
//        if (!q_authorityService.authority(role,token,"/q_course/all"))
//            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");
//
//        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",q_courseService.getById(id));
//    }
//
//
    @RequestMapping("/select")
    public Map<String,Object> select(UserTeacherTeache dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_course/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        List<UserTeacherTeache> datas = q_userTeacherTeacheService.select(dataDTO);

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",datas,datas.size());

    }
//
    @RequestMapping("/add")
    public Map<String,Object> add(UserTeacherTeache dataDTO){

        System.out.println(dataDTO.toString());

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_userTeache/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        dataDTO.setRole("teacher_teache");
        dataDTO.setStatus(ConstAttr.USER_STATUS_NORMAL);
        if (q_userTeacherTeacheService.insert(dataDTO) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"添加成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"添加失败");
    }
//
//
    @RequestMapping("/update")
    public Map<String,Object> update(UserTeacherTeache dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_userTeache/update"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");


        dataDTO.setRole("teacher_teache");

        if (q_userTeacherTeacheService.update(dataDTO) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"修改成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"修改失败");
    }
//    //
////
    @RequestMapping("/delete")
    public Map<String,Object> delete(@RequestParam("token")String token , @RequestParam("role")String role, @RequestParam("id")int id){

        if (!q_authorityService.authority(role,token,"/q_userTeache/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_userTeacherTeacheService.deleteById(id) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }
//    //
////
//    @RequestMapping("/deleteSome")
//    public Map<String,Object> deleteSome(Q_CourseDTO dataDTO){
//
//        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_course/delete"))
//            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");
//
//        int length = dataDTO.getIds().size();
//        int status = 0 ;
//
//        for (Integer id : dataDTO.getIds()) {
//            status += q_courseService.deleteById(id);
//        }
//
//        if (status == length )
//            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
//        else if (status > 0)
//            return new ReturnResult().toMap(ConstAttr.ERROR,"部分删除成功");
//        else
//            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
//    }
//













}
