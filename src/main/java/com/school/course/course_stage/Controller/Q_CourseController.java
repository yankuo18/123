package com.school.course.course_stage.Controller;


import com.school.course.course_stage.DTO.Q_CourseDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.Course;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_CourseClassTypeService;
import com.school.course.course_stage.Service.Q_CourseService;
import com.school.course.course_stage.Service.Q_CourseTypeService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/q_course")
public class Q_CourseController {

    @Resource
    private Q_CourseService q_courseService ;

    @Resource
    private Q_CourseTypeService q_courseTypeService;

    @Resource
    private Q_CourseClassTypeService q_courseClassTypeService ;


    @Resource
    private Q_AuthorityService q_authorityService;


    @RequestMapping("/all")
    public Map<String,Object> getAll(@RequestParam("token") String token , @RequestParam("role")  String role){

        if (!q_authorityService.authority(role,token,"/q_course/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        List<Course> datas = q_courseService.getAll();

        List<Q_CourseDTO> dataDTOs = new ArrayList<>();
        for (Course data : datas) {
            Q_CourseDTO q_courseDTO = new Q_CourseDTO(
                    data,
                    q_courseTypeService.getById(data.getTypeCourseId()).getName(),
                    q_courseClassTypeService.getById(data.getTypeCourseClassId()).getName());

            dataDTOs.add(q_courseDTO);
        }

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",dataDTOs,dataDTOs.size());
    }

    @RequestMapping("/get")
    public Map<String,Object> get(@RequestParam("token") String token , @RequestParam("role")  String role, @RequestParam("id")  int id){

        if (!q_authorityService.authority(role,token,"/q_course/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",q_courseService.getById(id));
    }


    @RequestMapping("/select")
    public Map<String,Object> select(Q_CourseDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_course/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        List<Course> datas = q_courseService.select(dataDTO.toEntity());

        List<Q_CourseDTO> dataDTOs = new ArrayList<>();
        for (Course data : datas) {
            Q_CourseDTO q_courseDTO = new Q_CourseDTO(
                    data,
                    q_courseTypeService.getById(data.getTypeCourseId()).getName(),
                    q_courseClassTypeService.getById(data.getTypeCourseClassId()).getName());

            dataDTOs.add(q_courseDTO);
        }

        return new ReturnResult().toMap(ConstAttr.SUCCESS,"",dataDTOs,dataDTOs.size());

    }

    @RequestMapping("/add")
    public Map<String,Object> add(Q_CourseDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_course/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseService.insert(dataDTO.toEntity()) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"添加成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"添加失败");
    }


    @RequestMapping("/update")
    public Map<String,Object> update(Q_CourseDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_course/update"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseService.update(dataDTO.toEntity()) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"修改成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"修改失败");
    }
//
//
    @RequestMapping("/delete")
    public Map<String,Object> delete(@RequestParam("token")String token , @RequestParam("role")String role, @RequestParam("id")int id){

        if (!q_authorityService.authority(role,token,"/q_course/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseService.deleteById(id) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }
//
//
    @RequestMapping("/deleteSome")
    public Map<String,Object> deleteSome(Q_CourseDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_course/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        int length = dataDTO.getIds().size();
        int status = 0 ;

        for (Integer id : dataDTO.getIds()) {
            status += q_courseService.deleteById(id);
        }

        if (status == length )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else if (status > 0)
            return new ReturnResult().toMap(ConstAttr.ERROR,"部分删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }












}
