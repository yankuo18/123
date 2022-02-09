package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourse;
import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.TypeCourseMapper;
import com.school.course.course_stage.Service.Q_CourseTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Q_CourseTypeServiceImpl implements Q_CourseTypeService {

    @Resource
    private TypeCourseMapper typeCourseMapper;

    @Override
    public List<TypeCourse> getAll() {
        return typeCourseMapper.selectByExample(new TypeCourseExample());
    }

    @Override
    public int insert(TypeCourse typeCourse) {
        return typeCourseMapper.insert(typeCourse);
    }

    @Override
    public int deleteById(int id) {
        return typeCourseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(TypeCourse typeCourse) {
        return typeCourseMapper.updateByPrimaryKeySelective(typeCourse);
    }

    @Override
    public List<TypeCourse> select(TypeCourseExample typeCourseExample) {
        return typeCourseMapper.selectByExample(typeCourseExample);
    }

    @Override
    public TypeCourse getById(int id) {
        return typeCourseMapper.selectByPrimaryKey(id);
    }
}
