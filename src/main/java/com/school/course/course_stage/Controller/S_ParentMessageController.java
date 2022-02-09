package com.school.course.course_stage.Controller;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserParents;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserParentsExample;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.S_ParentMessageService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import com.school.course.course_stage.VO.UserParentsVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
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

        List<UserParentsVo> userParentsVo = s_parentMessageService.myGetAll();
        return new ReturnResult().toMap(ConstAttr.SUCCESS, "", userParentsVo, userParentsVo.size());
    }

    @RequestMapping("/add")
    public Map<String, Object> addParent(UserParents userParents) {
        if (!q_authorityService.authority(userParents.getRole(), userParents.getToken(), "/s_parentMessage/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR, "无权限");

        if (s_parentMessageService.insert(userParents) > 0)
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"添加成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"添加失败");
    }

    @RequestMapping("/delete")
    public Map<String,Object> deleteParent(@RequestParam("token")String token ,
                                           @RequestParam("role")String role,
                                           @RequestParam("id")int id){

        if (!q_authorityService.authority(role,token,"/s_parentMessage/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (s_parentMessageService.deleteById(id) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }


    @RequestMapping("/update")
    public Map<String, Object> updateParent(UserParents userParents) {
        if (!q_authorityService.authority(userParents.getRole(), userParents.getToken(), "/s_parentMessage/update"))
            return new ReturnResult().toMap(ConstAttr.ERROR, "无权限");

        userParents.setToken(null);
        if (s_parentMessageService.update(userParents) > 0)
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"修改成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"修改失败");
    }

//    @RequestMapping("/select")
//    public Map<String,Object> selectParentUser(UserParents userParents){
//
//        if (!q_authorityService.authority(userParents.getRole(), userParents.getToken(), "/s_parentMessage/all"))
//            return new ReturnResult().toMap(ConstAttr.ERROR, "无权限");
//
//        UserParentsExample userParentsExample = new UserParentsExample();
//
//        if (userParents.getName() != null){
//            userParentsExample.or().andNameEqualTo(userParents.getName());
//        }
//        if(userParents.getPhone() != null){
//            userParentsExample.or().andPhoneEqualTo(userParents.getPhone());
//        }
//
//        if(userParents.getName() == "" && userParents.getPhone() == ""){
//            List<UserParents> userParentSelected = s_parentMessageService.getAll();
//            return new ReturnResult().toMap(ConstAttr.SUCCESS,"", userParentSelected, userParentSelected.size());
//        }
//
//        List<UserParents> userParentSelected = s_parentMessageService.select(userParentsExample);
//
//        return new ReturnResult().toMap(ConstAttr.SUCCESS,"", userParentSelected, userParentSelected.size());
//    }

    @RequestMapping("/select")
    public Map<String,Object> selectParentUser(UserParentsVo userParentsVo){
        if (!q_authorityService.authority(userParentsVo.getRole(), userParentsVo.getToken(), "/s_parentMessage/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR, "无权限");

        List<UserParentsVo> userParentsVos = s_parentMessageService.mySelect(userParentsVo);

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"", userParentsVos, userParentsVos.size());
    }
}