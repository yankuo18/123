package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherTeache;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherTeacheExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.UserTeacherTeacheMapper;
import com.school.course.course_stage.Service.Q_UserTeacherTeacheService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class Q_UserTeacherTeacheServiceImpl implements Q_UserTeacherTeacheService {

    @Resource
    private UserTeacherTeacheMapper userTeacherTeacheMapper;

    @Override
    public UserTeacherTeache getByAccount(String account) {
        UserTeacherTeacheExample userTeacherTeacheExample = new UserTeacherTeacheExample();
        userTeacherTeacheExample.or().andAccountEqualTo(account);

        List<UserTeacherTeache> userTeacherTeaches = userTeacherTeacheMapper.selectByExample(userTeacherTeacheExample);
        if (userTeacherTeaches.size() > 0)
            return userTeacherTeaches.get(0);
        return null;
    }

    @Override
    public UserTeacherTeache getById(int id) {
        return userTeacherTeacheMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserTeacherTeache> getAll() {
        return userTeacherTeacheMapper.selectByExample(new UserTeacherTeacheExample());
    }

    @Override
    public List<UserTeacherTeache> getBySchool(int schoolId) {
        UserTeacherTeacheExample userTeacherTeacheExample = new UserTeacherTeacheExample();
        userTeacherTeacheExample.or().andSchoolIdEqualTo(schoolId);

        List<UserTeacherTeache> userTeacherTeaches = userTeacherTeacheMapper.selectByExample(userTeacherTeacheExample);

        return userTeacherTeaches;
    }

    @Override
    public int insert(UserTeacherTeache userTeacherTeache) {
        return userTeacherTeacheMapper.insert(userTeacherTeache);
    }

    @Override
    public int deleteById(int id) {
        return userTeacherTeacheMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(UserTeacherTeache userTeacherTeache) {
        return userTeacherTeacheMapper.updateByPrimaryKeySelective(userTeacherTeache);
    }

    @Override
    public List<UserTeacherTeache> select(UserTeacherTeache userTeacherTeache) {
        UserTeacherTeacheExample userTeacherTeacheExample = new UserTeacherTeacheExample();

        UserTeacherTeacheExample.Criteria criteria = userTeacherTeacheExample.createCriteria();

        criteria.andSchoolIdEqualTo(userTeacherTeache.getSchoolId());

        if (!userTeacherTeache.getName().equals("") && userTeacherTeache.getName()!=null){
            criteria.andNameLike("%"+userTeacherTeache.getName()+"%");
        }
        return userTeacherTeacheMapper.selectByExample(userTeacherTeacheExample);
    }
}
