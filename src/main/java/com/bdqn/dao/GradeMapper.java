package com.bdqn.dao;

import com.bdqn.entity.Grade;

/**
 * Created by lenovo on 2018/3/13.
 */
public interface GradeMapper {
    //查询一个班级里的所有学生
    public Grade queryGradeId(Integer gradeId);
}
