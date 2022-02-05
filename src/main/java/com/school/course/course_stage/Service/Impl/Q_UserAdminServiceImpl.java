package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserAdmin;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserAdminExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.UserAdminMapper;
import com.school.course.course_stage.Service.Q_UserAdminService;
import com.school.course.course_stage.Util.Tools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class Q_UserAdminServiceImpl implements Q_UserAdminService {

    @Resource
    private UserAdminMapper userAdminMapper ;

    @Override
    public UserAdmin getByAccount(String account) {
        UserAdminExample userAdminExample = new UserAdminExample();
        userAdminExample.or().andAccountEqualTo(account);
        List<UserAdmin> userAdmins = userAdminMapper.selectByExample(userAdminExample);
        if (userAdmins.size() != 0 ){
            return userAdmins.get(0);
        }else {
            return null ;
        }
    }

    @Override
    public int update(UserAdmin userAdmin) {
        userAdmin.setUpdateAt(new Date());
        return userAdminMapper.updateByPrimaryKey(userAdmin);
    }

    @Override
    public String login(String account, String password) {
        UserAdmin userAdmin = this.getByAccount(account);

        if (userAdmin == null )
            return null ;

        if (userAdmin.getPassword().equals(password)){
            String token = Tools.getToken(account);
            userAdmin.setToken(token);
            int count = this.update(userAdmin);
            if (count > 0){
                return token ;
            }else {
                return null ;
            }
        }

        return null;
    }

    @Override
    public boolean haveToken(String token) {
        UserAdminExample userAdminExample = new UserAdminExample();
        userAdminExample.or().andTokenEqualTo(token);
        List<UserAdmin> userAdmins = userAdminMapper.selectByExample(userAdminExample);
        return userAdmins.size() > 0 ;
    }
}
