package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.SystemMenu;

import java.util.List;
import java.util.Map;

public interface Q_SystemMenuService {

    List<SystemMenu> getAll();

    List<SystemMenu> getMenuByRole(String role);

    Map<String,Object> menuIndex(String role);

    List<SystemMenu> getMenuByRoleAndStatus(String role , int status);



}
