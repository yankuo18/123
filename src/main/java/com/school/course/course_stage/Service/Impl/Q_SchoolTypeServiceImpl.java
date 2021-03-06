package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.TypeSchool;
import com.school.course.course_stage.MybaitsGenerator.Entity.TypeSchoolExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.TypeSchoolMapper;
import com.school.course.course_stage.Service.Q_SchoolTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class Q_SchoolTypeServiceImpl implements Q_SchoolTypeService {


    @Resource
    private TypeSchoolMapper typeSchoolMapper;



    @Override
    public List<TypeSchool> getAll() {
        return typeSchoolMapper.selectByExample(new TypeSchoolExample());
    }

    @Override
    public int deleteById(int id) {
        return typeSchoolMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(TypeSchool typeSchool) {
        return typeSchoolMapper.updateByPrimaryKey(typeSchool);
    }

    @Override
    public int insert(TypeSchool typeSchool) {
        return typeSchoolMapper.insert(typeSchool);
    }

    @Override
    public int insert(String name, String remark) {
        TypeSchool typeSchool = new TypeSchool();
        typeSchool.setName(name);
        typeSchool.setRemark(remark);
        typeSchool.setCreateAt(new Date());

        return this.insert(typeSchool);
    }
}
