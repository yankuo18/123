package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.View.MenuVo;
import com.school.course.course_stage.MybaitsGenerator.Entity.SystemMenu;
import com.school.course.course_stage.MybaitsGenerator.Entity.SystemMenuExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.SystemMenuMapper;
import com.school.course.course_stage.Service.SysMenuService;
import com.school.course.course_stage.Util.TreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class SysMenuServiceImpl implements SysMenuService {


    @Resource
    private SystemMenuMapper systemMenuMapper;

    @Override
    public Map<String, Object> menu() {
        Map<String, Object> map = new HashMap<>(16);
        Map<String,Object> home = new HashMap<>(16);
        Map<String,Object> logo = new HashMap<>(16);
        SystemMenuExample systemMenuExample = new SystemMenuExample();
        systemMenuExample.setOrderByClause("sort");
        systemMenuExample.or().andSortEqualTo(1);
        List<SystemMenu> menuList = systemMenuMapper.selectByExample(systemMenuExample);
        List<MenuVo> menuInfo = new ArrayList<>();
        for (SystemMenu e : menuList) {
            MenuVo menuVO = new MenuVo();
            menuVO.setId(e.getId().longValue());
            menuVO.setPid(e.getPid().longValue());
            menuVO.setHref(e.getHref());
            menuVO.setTitle(e.getTitle());
            menuVO.setIcon(e.getIcon());
            menuVO.setTarget(e.getTarget());
            menuInfo.add(menuVO);
        }
        map.put("menuInfo", TreeUtil.toTree(menuInfo, 0L));
        home.put("title","首页");
        home.put("href","/page/welcome-1");//控制器路由,自行定义
        logo.put("title","后台管理系统");
        logo.put("image","/static/images/back.jpg");//静态资源文件路径,可使用默认的logo.png
//        map.put("homeInfo", "{title: '首页',href: '/page/welcome.html'}}");
        map.put("homeInfo", "{title: '首页',href: '/index.html'}}");
        map.put("logoInfo", "{title: 'RUGE ADMIN',image: 'images/logo.png'}");
        return map;
    }
}
