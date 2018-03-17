package com.bdqn.dao;

import com.bdqn.entity.Tuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2018/3/13.
 */
public interface TuserMapper {

    //模糊查询
    public List<Tuser> getUserListByUserName(String userName);
    //根据用户名和昵称模糊查询 用实体入参
    public List<Tuser> getUserByUserNameAndNickName(Tuser tuser);

    //根据用户名和昵称模糊查询 用map入参
    public List<Tuser> getListMap(Map<String, String> map);

    //增加用户信息
    public Integer addUser(Tuser tuser);

    //修改
    public Integer updateUser(Tuser tuser);

    //传入多个参数修改指定用户的密码
    public Integer updateById(@Param("id") Integer id,
                              @Param("password") String pwd);

    // 根据昵称和用户名  动态查询
    public List<Tuser> querByUserNameAndNickName(Tuser tuser);

    //nickName和userName都动态传入查询用户列表
    public List<Tuser> queryUserByUserNameAndNickName(Tuser tuser);


}
