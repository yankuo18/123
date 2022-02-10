package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherManage;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherManageExample;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherTeache;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserTeacherTeacheExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.UserTeacherManageMapper;
import com.school.course.course_stage.MybaitsGenerator.Mapper.UserTeacherTeacheMapper;
import com.school.course.course_stage.Service.Q_UserTeacherManageService;
import com.school.course.course_stage.Service.Q_UserTeacherTeacheService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class Q_UserTeacherManageServiceImpl implements Q_UserTeacherManageService {

    @Resource
    private UserTeacherManageMapper userTeacherManageMapper;

    @Override
    public UserTeacherManage getByAccount(String account) {
        UserTeacherManageExample userTeacherManageExample = new UserTeacherManageExample();
        userTeacherManageExample.or().andAccountEqualTo(account);

        List<UserTeacherManage> userTeacherManages = userTeacherManageMapper.selectByExample(userTeacherManageExample);
        if (userTeacherManages.size() > 0)
            return userTeacherManages.get(0);
        return null;
    }

    @Override
    public UserTeacherManage getById(int id) {
        return userTeacherManageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserTeacherManage> getAll() {
        return userTeacherManageMapper.selectByExample(new UserTeacherManageExample());
    }

    @Override
    public List<UserTeacherManage> getBySchool(int schoolId) {
        UserTeacherManageExample userTeacherManageExample = new UserTeacherManageExample();
        userTeacherManageExample.or().andSchoolIdEqualTo(schoolId);

        List<UserTeacherManage> userTeacherManages = userTeacherManageMapper.selectByExample(userTeacherManageExample);

        return userTeacherManages;
    }

    @Override
    public int insert(UserTeacherManage userTeacherManage) {
        return userTeacherManageMapper.insert(userTeacherManage);
    }

    @Override
    public int deleteById(int id) {
        return userTeacherManageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(UserTeacherManage userTeacherManage) {
        return userTeacherManageMapper.updateByPrimaryKeySelective(userTeacherManage);
    }

    @Override
    public List<UserTeacherManage> select(UserTeacherManage userTeacherManage) {
        UserTeacherManageExample userTeacherManageExample = new UserTeacherManageExample();

        UserTeacherManageExample.Criteria criteria = userTeacherManageExample.createCriteria();

        criteria.andSchoolIdEqualTo(userTeacherManage.getSchoolId());

        if (!userTeacherManage.getName().equals("") && userTeacherManage.getName()!=null){
            criteria.andNameLike("%"+userTeacherManage.getName()+"%");
        }
        return userTeacherManageMapper.selectByExample(userTeacherManageExample);
    }
}
