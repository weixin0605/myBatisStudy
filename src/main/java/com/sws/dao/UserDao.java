package com.sws.dao;

import com.sws.entity.User;

public interface UserDao {
    public User findUserById(int id) throws Exception;

    public void insertUser(User user) throws  Exception;

    public void eleteUser(int id)throws Exception;
}
