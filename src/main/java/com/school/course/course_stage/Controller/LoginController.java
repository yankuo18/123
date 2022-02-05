package com.school.course.course_stage.Controller;

import com.school.course.course_stage.MybaitsGenerator.Entity.SystemUser;
import com.school.course.course_stage.Service.Q_UserAdminService;
import com.school.course.course_stage.Service.Q_UserSchoolService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import com.school.course.course_stage.Util.Tools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {


    @Resource
    private Q_UserAdminService q_userAdminService ;

    @Resource
    private Q_UserSchoolService q_userSchoolService;


    @RequestMapping(value = "pc",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> loginPC(@RequestParam("username") String account ,@RequestParam("password") String password ,@RequestParam("role") String role){

        //TODO 等待删除,测试方便
        if (account.equals("test"))
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"登录成功","token","test");

        String token = null ;

        switch (role){
            case ConstAttr.ADMIN:
                token = q_userAdminService.login(account,password);
                break;
            case ConstAttr.SCHOOL:
                token = q_userSchoolService.login(account,password);
                break;
            case ConstAttr.TEACHER_MANAGE:


                break;
            case ConstAttr.TEACHER_TEACHE:


                break;
            default:

                break;
        }

        if ( token != null && !token.equals("") )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"login success","token",token);
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"login error");

    }










}
