package com.school.course.course_stage.Controller;

import com.school.course.course_stage.DTO.Q_CourseSchoolDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.Course;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserSchool;
import com.school.course.course_stage.Service.Q_AuthorityService;
import com.school.course.course_stage.Service.Q_CourseSchoolService;
import com.school.course.course_stage.Service.Q_CourseService;
import com.school.course.course_stage.Service.Q_UserSchoolService;
import com.school.course.course_stage.Util.ConstAttr;
import com.school.course.course_stage.Util.ReturnResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/q_courseSchool")
public class Q_CourseSchoolController {

    @Resource
    private Q_CourseSchoolService q_courseSchoolService;

    @Resource
    private Q_CourseService q_courseService;

    @Resource
    private Q_UserSchoolService q_userSchoolService ;


    @Resource
    private Q_AuthorityService q_authorityService;


    @RequestMapping("/all")
    public Map<String,Object> getAll(@RequestParam("token") String token , @RequestParam("role")  String role , @RequestParam("schoolId")int schoolId ){

        if (!q_authorityService.authority(role,token,"/q_courseSchool/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (schoolId > 0){
            List<Q_CourseSchoolDTO> datas = q_courseSchoolService.getDTOs(schoolId);

            return new ReturnResult().toMap(ConstAttr.SUCCESS,"",datas,datas.size());

        }else {
            List<Course> datas = q_courseService.getAll();

            return new ReturnResult().toMap(ConstAttr.SUCCESS,"",q_courseSchoolService.toDTO(datas),q_courseSchoolService.toDTO(datas).size());

        }

    }
//
//
    @RequestMapping("/select")
    public Map<String,Object> select(Q_CourseSchoolDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_courseSchool/all"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");


        if (dataDTO.getSchoolId() > 0){
            List<Q_CourseSchoolDTO> datas = q_courseSchoolService.getDTOsByLike(dataDTO.getSchoolId(),dataDTO.getCourseName());

            return new ReturnResult().toMap(ConstAttr.SUCCESS,"",datas,datas.size());

        }else {
            Course course = new Course();
            course.setName(dataDTO.getCourseName());
            List<Q_CourseSchoolDTO> datas = q_courseSchoolService.toDTO(q_courseService.select(course));

            return new ReturnResult().toMap(ConstAttr.SUCCESS,"",datas,datas.size());

        }

    }
//
//
    @RequestMapping("/add")
    public Map<String,Object> add(Q_CourseSchoolDTO dto){

        if (!q_authorityService.authority(dto.getRole(),dto.getToken(),"/q_courseSchool/add"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        CourseSchool courseSchool = new CourseSchool();

        courseSchool.setAdaptTime(dto.getAdaptTime());
        courseSchool.setCourseId(dto.getCourseId());
        courseSchool.setCourseName(dto.getCourseName());
        courseSchool.setSchoolId(dto.getSchoolId());

        if (dto.getAdaptTime().replace(" ","").equals("")){
            return new ReturnResult().toMap(ConstAttr.ERROR," 不能设置空字符，设置失败");
        }

        UserSchool userSchool = q_userSchoolService.getById(dto.getSchoolId());

        courseSchool.setSchoolName(userSchool.getName());


        //如果 设定条例存在，则更新，否则添加
        if (q_courseSchoolService.checkByCourseAndSchool(courseSchool.getCourseId(),courseSchool.getSchoolId())){
            return this.update(dto);
        }


        if (q_courseSchoolService.insert(courseSchool) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"设置成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"设置失败");
    }
//
//
    @RequestMapping("/update")
    public Map<String,Object> update(Q_CourseSchoolDTO dataDTO){

        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_courseSchool/update"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        CourseSchool courseSchool = new CourseSchool();
        courseSchool.setId(dataDTO.getSetId());
        courseSchool.setAdaptTime(dataDTO.getAdaptTime());

        if (q_courseSchoolService.update(courseSchool) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"修改成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"修改失败");
    }
//
//
    @RequestMapping("/delete")
    public Map<String,Object> delete(@RequestParam("token")String token , @RequestParam("role")String role, @RequestParam("setId")int setId){

        if (!q_authorityService.authority(role,token,"/q_courseSchool/delete"))
            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");

        if (q_courseSchoolService.deleteById(setId) > 0 )
            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
        else
            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
    }
//
//
//    @RequestMapping("/deleteSome")
//    public Map<String,Object> deleteSome(Q_TypeCourseClassDTO dataDTO){
//
//        if (!q_authorityService.authority(dataDTO.getRole(),dataDTO.getToken(),"/q_courseClassType/delete"))
//            return new ReturnResult().toMap(ConstAttr.ERROR,"无权限");
//
//        int length = dataDTO.getIds().size();
//        int status = 0 ;
//
//        for (Integer id : dataDTO.getIds()) {
//            status += q_courseClassTypeService.deleteById(id);
//        }
//
//        if (status == length )
//            return new ReturnResult().toMap(ConstAttr.SUCCESS,"删除成功");
//        else if (status > 0)
//            return new ReturnResult().toMap(ConstAttr.ERROR,"部分删除成功");
//        else
//            return new ReturnResult().toMap(ConstAttr.ERROR,"删除失败");
//    }















}
