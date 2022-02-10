package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.DTO.Q_CourseSchoolDTO;
import com.school.course.course_stage.MybaitsGenerator.Entity.Course;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseSchoolExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.CourseSchoolMapper;
import com.school.course.course_stage.MybaitsGenerator.Mapper.Q_Mapper;
import com.school.course.course_stage.Service.Q_CourseSchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class Q_CourseSchoolServiceImpl implements Q_CourseSchoolService {

    @Resource
    private CourseSchoolMapper courseSchoolMapper;

    @Resource
    private Q_Mapper q_mapper;

    @Override
    public List<CourseSchool> getAll() {
        return courseSchoolMapper.selectByExample(new CourseSchoolExample());
    }

    @Override
    public List<CourseSchool> getBySchoolId(int schoolId) {

        CourseSchoolExample courseSchoolExample = new CourseSchoolExample();
        CourseSchoolExample.Criteria criteria = courseSchoolExample.createCriteria();

        criteria.andSchoolIdEqualTo(schoolId);
        return courseSchoolMapper.selectByExample(courseSchoolExample);
    }

    @Override
    public int insert(CourseSchool courseSchool) {
        return courseSchoolMapper.insert(courseSchool);
    }

    @Override
    public int deleteById(int id) {
        return courseSchoolMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(CourseSchool courseSchool) {
        return courseSchoolMapper.updateByPrimaryKeySelective(courseSchool);
    }

    @Override
    public List<CourseSchool> select(CourseSchool courseSchool) {

        CourseSchoolExample courseSchoolExample = new CourseSchoolExample();
        CourseSchoolExample.Criteria criteria = courseSchoolExample.createCriteria();

        if (courseSchool.getCourseName() != null) {
            criteria.andCourseNameLike("%"+courseSchool.getCourseName()+"%");
        }

        return courseSchoolMapper.selectByExample(courseSchoolExample);
    }

    @Override
    public List<Q_CourseSchoolDTO> getDTOs(int schoolId) {
        return q_mapper.getBySchoolId(schoolId);
    }

    @Override
    public List<Q_CourseSchoolDTO> getDTOsByLike(int schoolId, String name) {
        return q_mapper.getBySchoolIdAndLike(schoolId,"%"+name+"%");
    }

    @Override
    public List<Q_CourseSchoolDTO> toDTO(List<Course> courses) {

        List<Q_CourseSchoolDTO> dtos = new ArrayList<>();

        for (Course course : courses) {
            Q_CourseSchoolDTO courseSchoolDTO = new Q_CourseSchoolDTO();
            courseSchoolDTO.setCourseId(course.getId());
            courseSchoolDTO.setCourseName(course.getName());
            dtos.add(courseSchoolDTO);
        }

        return dtos;
    }

    @Override
    public boolean checkByCourseAndSchool(int courseId, int schoolId) {

        CourseSchoolExample courseSchoolExample = new CourseSchoolExample();

        courseSchoolExample.or().andCourseIdEqualTo(courseId).andSchoolIdEqualTo(schoolId);

        List<CourseSchool> courseSchools = courseSchoolMapper.selectByExample(courseSchoolExample);

        return  (courseSchools.size() > 0) ;
    }
}
