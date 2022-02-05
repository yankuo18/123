package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.RoleMenu;
import com.school.course.course_stage.MybaitsGenerator.Entity.RoleMenuExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.RoleMenuMapper;
import com.school.course.course_stage.Service.Q_RoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Q_RoleMenuServiceImpl implements Q_RoleMenuService {


    @Resource
    private RoleMenuMapper roleMenuMapper ;

    @Override
    public List<RoleMenu> getByRole(String role) {
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        roleMenuExample.or().andRoleEqualTo(role);
        return roleMenuMapper.selectByExample(roleMenuExample);
    }
}
