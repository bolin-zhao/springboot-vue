package com.bolin.dao;

import com.bolin.pojo.User;

import java.util.List;


public interface UserMapper {
    /**
     * 查询所有用户
     */
    List<User> findAll();

    /**
     * 更新用户
     */
    void update(User user);

    /**
     * 根据 id 查询用户
     */

    User findById(Integer id);
}
