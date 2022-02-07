package com.school.course.course_stage.Controller;

import com.school.course.course_stage.DTO.Q_SchoolUserDeleteSomeDTO;
import com.school.course.course_stage.DTO.Q_TyperCourseDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourse;
import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseExample;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchoolExample;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_CourseTypeService;
import com.school.course.course_stage.Service.Q_UserSchoolService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.omg.CORBA.TypeCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/q_courseType")
public class Q_CourseTypeController {


    @Resource
    private Q_CourseTypeService q_courseTypeService ;


    @Resource
    private Q_AuthorityService q_authorityService;


    @RequestMapping("/all")
    public Map<String,Object> getAll(@RequestParam("token") String token , @RequestParam("role")  String role){

        if (!q_authorityService.authority(role,token,"/q_courseType/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        List<TypeCourse> userSchools = q_courseTypeService.getAll();

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",userSchools,userSchools.size());
    }

    @RequestMapping("/select")
    public Map<String,Object> select(Q_TyperCourseDTO q_typerCourseDTO){

        if (!q_authorityService.authority(q_typerCourseDTO.getRole(),q_typerCourseDTO.getToken(),"/q_courseType/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        TypeCourseExample typeCourseExample = new TypeCourseExample();

        TypeCourseExample.Criteria criteria = typeCourseExample.createCriteria();

        if (q_typerCourseDTO.getName() != null && !q_typerCourseDTO.getName().equals("")){
            criteria.andNameLike("%"+q_typerCourseDTO.getName()+"%");
        }

        if (q_typerCourseDTO.getCode() != null && !q_typerCourseDTO.getCode().equals("")){
            criteria.andCodeLike("%"+q_typerCourseDTO.getCode()+"%");
        }

//
        List<TypeCourse> typeCourses = q_courseTypeService.select(typeCourseExample);

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",typeCourses,typeCourses.size());

    }

//
    @RequestMapping("/add")
    public Map<String,Object> add(Q_TyperCourseDTO q_typerCourseDTO){

        if (!q_authorityService.authority(q_typerCourseDTO.getRole(),q_typerCourseDTO.getToken(),"/q_courseType/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        TypeCourse data = new TypeCourse();
        data.setName(q_typerCourseDTO.getName());
        data.setCode(q_typerCourseDTO.getCode());

        if (q_courseTypeService.insert(data) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"添加成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"添加失败");
    }
//    //
////
////
    @RequestMapping("/update")
    public Map<String,Object> update(Q_TyperCourseDTO q_typerCourseDTO){

        if (!q_authorityService.authority(q_typerCourseDTO.getRole(),q_typerCourseDTO.getToken(),"/q_courseType/update"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseTypeService.update(q_typerCourseDTO.toEntity()) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"修改成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"修改失败");
    }
//    //
////
    @RequestMapping("/delete")
    public Map<String,Object> delete(@RequestParam("token")String token , @RequestParam("role")String role, @RequestParam("id")int id){

        if (!q_authorityService.authority(role,token,"/q_courseType/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseTypeService.deleteById(id) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }
//
    @RequestMapping("/deleteSome")
    public Map<String,Object> deleteSome(Q_SchoolUserDeleteSomeDTO q_schoolUserDeleteSomeDTO){

        if (!q_authorityService.authority(q_schoolUserDeleteSomeDTO.getRole(),q_schoolUserDeleteSomeDTO.getToken(),"/q_courseType/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        int length = q_schoolUserDeleteSomeDTO.getIds().size();
        int status = 0 ;

        for (Integer id : q_schoolUserDeleteSomeDTO.getIds()) {
            status += q_courseTypeService.deleteById(id);
        }

        if (status == length )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else if (status > 0)
            return new ReturnResult().toMap(ConstAttr.ERROR,"部分删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }

//
//







}
