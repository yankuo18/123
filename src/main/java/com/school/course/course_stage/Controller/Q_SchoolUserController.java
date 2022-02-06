package com.school.course.course_stage.Controller;


import com.school.course.course_stage.DTO.Q_SchoolUserDeleteSomeDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchoolExample;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_UserSchoolService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/q_schoolUser")
public class Q_SchoolUserController {


    @Resource
    private Q_AuthorityService q_authorityService;

    @Resource
    private Q_UserSchoolService q_userSchoolService ;


    @RequestMapping("/all")
    public Map<String,Object> getAllSchoolUser(@RequestParam("token") String token , @RequestParam("role")  String role){

        if (!q_authorityService.authority(role,token,"/q_schoolUser/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        List<UserSchool> userSchools = q_userSchoolService.getAll();

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",userSchools,userSchools.size());
    }

    @RequestMapping("/select")
    public Map<String,Object> selectSchoolUser(UserSchool userSchool){

        if (!q_authorityService.authority(userSchool.getRole(),userSchool.getToken(),"/q_schoolUser/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        UserSchoolExample userSchoolExample = new UserSchoolExample();

        if (userSchool.getName() != null ){
            userSchoolExample.or().andNameEqualTo(userSchool.getName());
        }
        if (userSchool.getCode() != null ){
            userSchoolExample.or().andCodeEqualTo(userSchool.getCode());
        }
        if (userSchool.getTypeSchool() != null ){
            userSchoolExample.or().andTypeSchoolEqualTo(userSchool.getTypeSchool());
        }

        List<UserSchool> userSchools = q_userSchoolService.select(userSchoolExample);

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",userSchools,userSchools.size());
    }


    @RequestMapping("/add")
    public Map<String,Object> addSchoolUser(UserSchool userSchool){

        if (!q_authorityService.authority(userSchool.getRole(),userSchool.getToken(),"/q_schoolType/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        userSchool.setStatus(ConstAttr.USER_STATUS_NORMAL);
        userSchool.setToken(null);

        if (q_userSchoolService.insert(userSchool) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"添加成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"添加失败");
    }
//
//
//
    @RequestMapping("/update")
    public Map<String,Object> updateSchoolUser(UserSchool userSchool){

        if (!q_authorityService.authority(userSchool.getRole(),userSchool.getToken(),"/q_schoolType/update"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        userSchool.setToken(null);

        System.out.println(userSchool.toString());

        if (q_userSchoolService.update(userSchool) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"修改成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"修改失败");
    }
//
//
    @RequestMapping("/delete")
    public Map<String,Object> deleteSchoolUser(@RequestParam("token")String token , @RequestParam("role")String role, @RequestParam("id")int id){

        if (!q_authorityService.authority(role,token,"/q_schoolType/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_userSchoolService.deleteById(id) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }

    @RequestMapping("/deleteSome")
    public Map<String,Object> deleteSomeSchoolUser(Q_SchoolUserDeleteSomeDTO q_schoolUserDeleteSomeDTO){

        if (!q_authorityService.authority(q_schoolUserDeleteSomeDTO.getRole(),q_schoolUserDeleteSomeDTO.getToken(),"/q_schoolType/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        int length = q_schoolUserDeleteSomeDTO.getIds().size();
        int status = 0 ;

        for (Integer id : q_schoolUserDeleteSomeDTO.getIds()) {
            status += q_userSchoolService.deleteById(id);
        }

        if (status == length )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else if (status > 0)
            return new ReturnResult().toMap(ConstAttr.ERROR,"部分删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }


}
