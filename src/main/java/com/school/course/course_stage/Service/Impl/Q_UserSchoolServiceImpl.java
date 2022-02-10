package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchoolExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.UserSchoolMapper;
import com.school.course.course_stage.Service.Q_UserSchoolService;
import com.school.course.course_stage.Util.Tools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class Q_UserSchoolServiceImpl implements Q_UserSchoolService {

    @Resource
    private UserSchoolMapper userSchoolMapper ;

    @Override
    public UserSchool getByAccount(String account) {
        UserSchoolExample userSchoolExample = new UserSchoolExample();
        userSchoolExample.or().andAccountEqualTo(account);
        List<UserSchool> userSchools = userSchoolMapper.selectByExample(userSchoolExample);
        if (userSchools.size() > 0 )
            return userSchools.get(0);
        return null;
    }

    @Override
    public int update(UserSchool userSchool) {
        userSchool.setUpdateAt(new Date());
        return userSchoolMapper.updateByPrimaryKeySelective(userSchool);
    }

    @Override
    public int deleteById(int id) {
        return userSchoolMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserSchool userSchool) {
        userSchool.setCreateAt(new Date());
        return userSchoolMapper.insert(userSchool);
    }

    @Override
    public String login(String account, String password) {
        UserSchool user = this.getByAccount(account);

        if (user == null)
            return null ;

        if (user.getPassword().equals(password)){
            String token = Tools.getToken(account);
            user.setToken(token);
            int count = this.update(user);
            if (count > 0){
                return token ;
            }else {
                return null ;
            }
        }

        return null;
    }

    @Override
    public List<UserSchool> getAll() {
        return userSchoolMapper.selectByExample(new UserSchoolExample());
    }

    @Override
    public List<UserSchool> select(UserSchoolExample userSchoolExample) {
        return userSchoolMapper.selectByExample(userSchoolExample);
    }

    @Override
    public UserSchool getById(int id) {
        return userSchoolMapper.selectByPrimaryKey(id);
    }
}
