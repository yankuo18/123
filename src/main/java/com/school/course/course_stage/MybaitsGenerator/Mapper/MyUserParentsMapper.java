package com.school.course.course_stage.MybaitsGenerator.Mapper;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserParents;
import com.school.course.course_stage.VO.UserParentsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName MyUserParentsMapper
 * @Description TODO
 * @date 2022/2/9 21:34
 * @Author Rosinante
 * @Version 1.0
 */
@Mapper
public interface MyUserParentsMapper {

    List<UserParentsVo> myGetAll();

    List<UserParentsVo> mySelect(UserParentsVo userParentsVo);
}
