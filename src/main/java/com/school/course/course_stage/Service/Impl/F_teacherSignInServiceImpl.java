package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.TeacherSignRecord;
import com.school.course.course_stage.MybaitsGenerator.Entity.TeacherSignRecordExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.TeacherSignRecordMapper;
import com.school.course.course_stage.Service.F_teacherSignInService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class F_teacherSignInServiceImpl implements F_teacherSignInService {

    @Resource
    private TeacherSignRecordMapper teacherSignRecordMapper;

    @Override
    public List<TeacherSignRecord> getTeacherSignRecord(String username, String courseTime,String courseName) {
         TeacherSignRecordExample teacherSignRecordExample = new TeacherSignRecordExample();
        teacherSignRecordExample.or().andTeacherNameEqualTo(username).andCourseNameEqualTo(courseName).andCourseTimeEqualTo(courseTime);
        List<TeacherSignRecord> TeacherSignRecordList = teacherSignRecordMapper.selectByExample(teacherSignRecordExample);
        return TeacherSignRecordList;
    }

    @Override
    public int insert(TeacherSignRecord insertTeacherSign) {
        return teacherSignRecordMapper.insert(insertTeacherSign);
    }
}
