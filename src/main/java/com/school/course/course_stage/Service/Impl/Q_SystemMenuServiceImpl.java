package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.RoleMenu;
import com.school.course.course_stage.MybaitsGenerator.Entity.SystemMenu;
import com.school.course.course_stage.MybaitsGenerator.Entity.SystemMenuExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.SystemMenuMapper;
import com.school.course.course_stage.Service.Q_RoleMenuService;
import com.school.course.course_stage.Service.Q_SystemMenuService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.TreeUtil;
import com.school.course.course_stage.VO.MenuVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class Q_SystemMenuServiceImpl implements Q_SystemMenuService {

    @Resource
    private SystemMenuMapper systemMenuMapper ;

    @Resource
    private Q_RoleMenuService q_roleMenuService;

    @Override
    public List<SystemMenu> getAll() {
        return systemMenuMapper.selectByExample(new SystemMenuExample());
    }

    @Override
    public List<SystemMenu> getMenuByRole(String role) {
        List<RoleMenu> roleMenus = q_roleMenuService.getByRole(role) ;
        List<SystemMenu> systemMenus = new ArrayList<>();

        for (RoleMenu roleMenu : roleMenus) {
            SystemMenu systemMenu = this.systemMenuMapper.selectByPrimaryKey(roleMenu.getMenuId());
            systemMenus.add(systemMenu);
        }

        return systemMenus;
    }

    @Override
    public Map<String, Object> menuIndex(String role) {
        List<SystemMenu> systemMenus = this.getMenuByRoleAndStatus(role,ConstAttr.MENU_NORMAL);

        Map<String, Object> map = new HashMap<>(16);
        Map<String,Object> home = new HashMap<>(16);
        Map<String,Object> logo = new HashMap<>(16);

        List<MenuVo> menuInfo = new ArrayList<>();
        for (SystemMenu e : systemMenus) {
            MenuVo menuVO = new MenuVo();
            menuVO.setId(e.getId().longValue());
            menuVO.setPid(e.getPid().longValue());
            menuVO.setHref(e.getHref());
            menuVO.setTitle(e.getTitle());
            menuVO.setIcon(e.getIcon());
            menuVO.setTarget(e.getTarget());
            menuInfo.add(menuVO);
        }

        home.put("title","首页");
        home.put("href","page/welcome-1.html?t=1");//控制器路由,自行定义
        logo.put("title","后台管理系统");
        logo.put("image","images/logo.png");//静态资源文件路径,可使用默认的logo.png
        logo.put("href","./");//静态资源文件路径,可使用默认的logo.png
        map.put("homeInfo", home);
        map.put("logoInfo", logo);
        map.put("menuInfo", TreeUtil.toTree(menuInfo, 0L));
        return map;
    }

    @Override
    public List<SystemMenu> getMenuByRoleAndStatus(String role, int status) {
        List<SystemMenu> systemMenus = this.getMenuByRole(role);
        List<SystemMenu> newMenus = new ArrayList<>();
        for (SystemMenu systemMenu : systemMenus) {
            if (systemMenu.getStatus() == status){
                newMenus.add(systemMenu);
            }
        }
        return newMenus;
    }
}
