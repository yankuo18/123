package com.school.course.course_stage.MybaitsGenerator.Entity;

import java.io.Serializable;
import java.sql.Date;

public class SysMenu implements Serializable {
    // 复合主键要用这个注解
//    private MenuKey key;
    private Long pid;
    private String icon;
    private String target;
    private Integer sort;
    private Boolean status;
    private String remark;
    private Date create_at;
    private Date update_at;
    private Date delete_at;
}
