package com.school.course.course_stage.Controller;

import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.S_ParentMessageService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @ClassName S_ParentMessageController
 * @Description TODO
 * @date 2022/2/5 21:49
 * @Author Rosinante
 * @Version 1.0
 */

@RestController
@RequestMapping("/s_parentMessage")
public class S_ParentMessageController {

    @Resource
    private Q_AuthorityService q_authorityService;

    @Resource
    private S_ParentMessageService s_parentMessageService;

    @RequestMapping("/all")
    public Map<String, Object> getAllParentMessage(@RequestParam("token") String token, @RequestParam("role") String role) {

        if (!q_authorityService.authority(role, token, "/s_parentMessage/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR, "无权限");

        return new ReturnResult().toMap(ConstAttr.SUCCESS, "", s_parentMessageService.getAll());
    }

    @RequestMapping("/add")
    // TODO 后台教师信息添加功能是否需要
    public Map<String, Object> addParent(@RequestParam("token") String token,
                                         @RequestParam("role") String role,
                                         @RequestParam("name") String name,
                                         @RequestParam("remark") String remark) {

        return null;
    }
}