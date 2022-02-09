package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.Course;
import com.school.course.course_stage.MybaitsGenerator.Entity.CourseExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.CourseMapper;
import com.school.course.course_stage.Service.Q_CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Q_CourseServiceImpl implements Q_CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> getAll() {
        return courseMapper.selectByExample(new CourseExample());
    }

    @Override
    public int insert(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int update(Course course) {
        return courseMapper.updateByPrimaryKeySelective(course);
    }

    @Override
    public int deleteById(int id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Course> select(Course course) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();

        if (!course.getName().equals("") && course.getName() != null){
            criteria.andNameLike("%"+course.getName()+"%");
        }
        if (course.getTypeCourseId() != null){
            criteria.andTypeCourseIdEqualTo(course.getTypeCourseId());
        }
        if (course.getTypeCourseClassId() != null){
            criteria.andTypeCourseClassIdEqualTo(course.getTypeCourseClassId());
        }
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public Course getById(int id) {
        return courseMapper.selectByPrimaryKey(id);
    }
}
