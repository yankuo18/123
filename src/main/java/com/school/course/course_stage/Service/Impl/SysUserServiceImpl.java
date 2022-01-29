package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.SystemUser;
import com.school.course.course_stage.MybaitsGenerator.Entity.SystemUserExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.SystemUserMapper;
import com.school.course.course_stage.Service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SystemUserMapper systemUserMapper;

    @Override
    public SystemUser getUserInfo(String account) {
        SystemUserExample systemUserExample = new SystemUserExample();
        systemUserExample.or().andAccountEqualTo(account);
        List<SystemUser> systemUsers = systemUserMapper.selectByExample(systemUserExample);
        if (systemUsers.size() > 0)
            return systemUsers.get(0);
        else
            return null;
    }

    @Override
    public boolean isLogin(String account, String password) {
        SystemUser systemUser = this.getUserInfo(account);

        return (password.equals(systemUser.getPassword()));
    }

    @Override
    public int updateUserInfo(SystemUser systemUser) {
        SystemUser user = this.getUserInfo(systemUser.getAccount());

        user.setToken(systemUser.getToken());

        return systemUserMapper.updateByPrimaryKey(user);
    }
}
