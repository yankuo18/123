package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseClass;
import com.school.course.course_stage.MybaitsGenerator.Entity.TypeCourseClassExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.TypeCourseClassMapper;
import com.school.course.course_stage.Service.Q_CourseClassTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Q_CourseClassServiceImpl implements Q_CourseClassTypeService {

    @Resource
    private TypeCourseClassMapper typeCourseClassMapper;

    @Override
    public List<TypeCourseClass> getAll() {
        return typeCourseClassMapper.selectByExample(new TypeCourseClassExample());
    }

    @Override
    public int insert(TypeCourseClass typeCourseClass) {
        return typeCourseClassMapper.insert(typeCourseClass);
    }

    @Override
    public int deleteById(int id) {
        return typeCourseClassMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(TypeCourseClass typeCourseClass) {
        return typeCourseClassMapper.updateByPrimaryKeySelective(typeCourseClass);
    }

    @Override
    public List<TypeCourseClass> select(TypeCourseClass typeCourseClass) {

        TypeCourseClassExample typeCourseClassExample = new TypeCourseClassExample();
        TypeCourseClassExample.Criteria criteria = typeCourseClassExample.createCriteria();

        if (typeCourseClass.getName() != null){
            criteria.andNameLike("%"+typeCourseClass.getName()+"%");
        }

        return typeCourseClassMapper.selectByExample(typeCourseClassExample);
    }

    @Override
    public TypeCourseClass getById(int id) {
        return typeCourseClassMapper.selectByPrimaryKey(id);
    }
}
