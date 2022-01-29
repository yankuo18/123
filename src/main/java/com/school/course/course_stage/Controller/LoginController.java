package com.school.course.course_stage.Controller;

import com.school.course.course_stage.MybaitsGenerator.Entity.SystemUser;
import com.school.course.course_stage.Service.SysUserService;
import com.school.course.course_stage.Util.Tools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/login")
public class LoginController {


    @Resource
    private SysUserService sysUserService ;

    @RequestMapping(value = "pc",method = RequestMethod.POST)
    @ResponseBody
    public String loginPC(@RequestParam("username") String account ,@RequestParam("password") String password){

        boolean isLogin = sysUserService.isLogin(account,password) ;

        String token = "";
        if (isLogin){
            token = Tools.getToken(account);

            //还要将token写入数据库
            SystemUser systemUser = new SystemUser() ;
            systemUser.setToken(token);
            systemUser.setAccount(account);

            int count = sysUserService.updateUserInfo(systemUser);
            if (count == 0 ){
                token = "";
            }
        }

        return token;
    }










}
