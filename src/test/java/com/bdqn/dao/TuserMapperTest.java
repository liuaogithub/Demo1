package com.bdqn.dao;

import com.bdqn.entity.Tuser;
import com.bdqn.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/3/13.
 */
public class TuserMapperTest {
    @Test
    public void queryUserByUserNameAndNickName() throws Exception {
        SqlSession sqlSession=null;
        List<Tuser> list=null;
        Tuser tuser=new Tuser();
        tuser.setUserName("a");
        tuser.setNickName("n");
        try {
            sqlSession=MybatisUtil.createSqlSession();
            list = sqlSession.getMapper(TuserMapper.class).queryUserByUserNameAndNickName(tuser);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void querByUserNameAndNickName() throws Exception {
        SqlSession sqlSession=null;
        List<Tuser> list=null;
        Tuser tuser=new Tuser();
        tuser.setUserName("a");
        //tuser.setNickName("n");
        try {
            sqlSession=MybatisUtil.createSqlSession();
            list = sqlSession.getMapper(TuserMapper.class).querByUserNameAndNickName(tuser);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        if(list!=null){
            for (Tuser user : list) {
                System.out.println(user);
            }
        }
    }

    @Test
    public void updateById() throws Exception {
        SqlSession sqlSession=null;
        int rows=0;
        try {
            sqlSession=MybatisUtil.createSqlSession();
            rows = sqlSession.getMapper(TuserMapper.class).updateById(1, "pwd");
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(rows);
    }

    @Test
    public void updateUser() throws Exception {
        SqlSession sqlSession=null;
        Tuser tuser=new Tuser();
        tuser.setUserName("add");
        tuser.setPassword("123");
        tuser.setNickName("yuan");
        tuser.setId(12);
        int rows=0;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            rows = sqlSession.getMapper(TuserMapper.class).updateUser(tuser);
            sqlSession.commit();;
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(rows);
    }

    @Test
    public void addUser() throws Exception {
        SqlSession sqlSession=null;
        Tuser tuser=new Tuser();
        tuser.setUserName("af");
        tuser.setPassword("123");
        tuser.setNickName("大");
        int rows=0;
        try {
            sqlSession =MybatisUtil.createSqlSession();
            rows = sqlSession.getMapper(TuserMapper.class).addUser(tuser);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(rows);

    }

    @Test
    public void getListMap() throws Exception {
        SqlSession sqlSession=null;
        List<Tuser> list=null;
        Map<String, String> map = new HashMap<>();
        map.put("userName", "u");
        map.put("nickName", "n");
        try {
            sqlSession=MybatisUtil.createSqlSession();
            list = sqlSession.getMapper(TuserMapper.class).getListMap(map);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        if(list!=null){
            for (Tuser tuser : list) {
                System.out.println(tuser);
            }
        }


    }

    @Test
    public void getUserByUserNameAndNickName() throws Exception {
        SqlSession sqlSession=null;
        List<Tuser> list=null;
        Tuser tuser=new Tuser();
        tuser.setUserName("u");
        tuser.setNickName("n");
        try {
            sqlSession=MybatisUtil.createSqlSession();
            list = sqlSession.getMapper(TuserMapper.class).getUserByUserNameAndNickName(tuser);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSqlSession(sqlSession);
        }
        if(list!=null){
            for (Tuser user : list) {
                System.out.println(user);
            }
        }


    }

    @Test
    public void getUserListByUserName() throws Exception {
        SqlSession sqlSession=null;
        List<Tuser> list=null;

        try {
            sqlSession=MybatisUtil.createSqlSession();
            list = sqlSession.getMapper(TuserMapper.class).getUserListByUserName("u");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
           MybatisUtil.closeSqlSession(sqlSession);
        }
        if(list!=null){
            for (Tuser tuser : list) {
                System.out.println(tuser);
            }
        }

    }

}





