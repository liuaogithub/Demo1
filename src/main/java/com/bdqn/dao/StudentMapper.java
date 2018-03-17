package com.bdqn.dao;

import com.bdqn.entity.Student;

import java.util.List;

/**
 * Created by lenovo on 2018/3/13.
 */
public interface StudentMapper {
    public List<Student> queryStudentByGradeId(Integer gradeId);
}
