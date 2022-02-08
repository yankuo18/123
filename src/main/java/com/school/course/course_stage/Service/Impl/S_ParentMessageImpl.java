package com.school.course.course_stage.Service.Impl;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserParents;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserParentsExample;
import com.school.course.course_stage.MybaitsGenerator.Mapper.UserParentsMapper;
import com.school.course.course_stage.Service.S_ParentMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName S_ParentMessageImpl
 * @Description TODO
 * @date 2022/2/5 22:11
 * @Author Rosinante
 * @Version 1.0
 */

@Service
public class S_ParentMessageImpl implements S_ParentMessageService {
    @Resource
    UserParentsMapper userParentsMapper;


    @Override
    public List<UserParents> getAll() {
        return userParentsMapper.selectByExample(new UserParentsExample());
    }

    @Override
    public int deleteById(int id) {
        return userParentsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(UserParents userParents) {
        return 0;
    }

    @Override
    public int insert(UserParents userParents) {
        return userParentsMapper.insert(userParents);
    }

    @Override
    public List<UserParents> select(UserParentsExample userParentsExample) {
        return userParentsMapper.selectByExample(userParentsExample);
    }
}
