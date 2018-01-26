package com.sws.mapper;

import com.sws.entity.User;
import com.sws.entity.UserCustom;
import com.sws.entity.UserQueryVo;

public interface UserMapper {
    public User findUserByID(int id) throws Exception;

    public void insertUser(User user) throws  Exception;

    public void deleteUser(int id)throws Exception;

    //UserMapper.java
    //用户信息综合查询
    public UserCustom findUserList(UserQueryVo userQueryVo)throws Exception;

    //用户信息综合查询总数
    public int findUserCount(UserQueryVo userQueryVo)throws Exception;

    //使用resultMap输出
    public User findUserByIdResultMap(int id)throws Exception;

}
