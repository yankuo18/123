package com.school.course.course_stage.Service;

import com.school.course.course_stage.MybaitsGenerator.Entity.UserParents;
import com.school.course.course_stage.MybaitsGenerator.Entity.UserParentsExample;

import java.util.List;

/**
 * @ClassName S_ParentMessage
 * @Description TODO
 * @date 2022/2/5 22:07
 * @Author Rosinante
 * @Version 1.0
 */
public interface S_ParentMessageService {
    List<UserParents> getAll();

    int deleteById(int id);

    int update(UserParents userParents);

    int insert(UserParents userParents);

    List<UserParents> select(UserParentsExample userParentsExample);
}
