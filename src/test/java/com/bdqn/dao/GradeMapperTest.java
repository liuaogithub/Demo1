package com.bdqn.dao;

import com.bdqn.entity.Grade;
import com.bdqn.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by lenovo on 2018/3/13.
 */
public class GradeMapperTest {
    @Test
    public void queryGradeId() throws Exception {
        SqlSession sqlSession=null;
        Grade grade=null;
        try {
            sqlSession= MybatisUtil.createSqlSession();
            grade = sqlSession.getMapper(GradeMapper.class).queryGradeId(7);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        if(grade!=null){
            System.out.println(grade);
        }
    }

}