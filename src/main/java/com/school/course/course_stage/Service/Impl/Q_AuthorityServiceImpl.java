package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.SystemMenu;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserAdmin;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_SystemMenuService;
import com.school.course.course_stage.Service.Q_UserAdminService;
import com.school.course.course_stage.Util.ConstAttr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class Q_AuthorityServiceImpl implements Q_AuthorityService {


    @Resource
    private Q_UserAdminService q_userAdminService ;
    @Resource
    private Q_SystemMenuService q_systemMenuService ;


    @Override
    public boolean authority(String role, String token, String href) {
        String tokenDB = "";
        List<String> strings = this.getHrefs(role);

        switch (role){
            case ConstAttr.ADMIN:
                if (q_userAdminService.haveToken(token) && strings.contains(href)) {
                    return true;
                }
                break;
            case ConstAttr.SCHOOL:

                break;
            case ConstAttr.TEACHER_MANAGE:

                break;
            case ConstAttr.TEACHER_TEACHE:

                break;
            default:

                break;
        }



        return false;
    }


    private List<String> getHrefs(String role){
        List<SystemMenu> systemMenus = q_systemMenuService.getMenuByRole(role);
        List<String> strings = new ArrayList<>();
        for (SystemMenu systemMenu : systemMenus) {
            strings.add(systemMenu.getHref());
        }
        return strings;
    }

}
