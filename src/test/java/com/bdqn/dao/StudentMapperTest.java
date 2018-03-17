package com.bdqn.dao;

import com.bdqn.entity.Student;
import com.bdqn.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2018/3/13.
 */
public class StudentMapperTest {
    @Test
    public void queryStudentByGradeId() throws Exception {
        SqlSession sqlSession=null;
        List<Student> list=null;
        try {
            sqlSession= MybatisUtil.createSqlSession();
            list = sqlSession.getMapper(StudentMapper.class).queryStudentByGradeId(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        if (null != list) {
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }

}