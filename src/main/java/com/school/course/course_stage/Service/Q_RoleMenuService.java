package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.RoleMenu;

import java.util.List;

public interface Q_RoleMenuService {

    List<RoleMenu> getByRole(String role);




}
