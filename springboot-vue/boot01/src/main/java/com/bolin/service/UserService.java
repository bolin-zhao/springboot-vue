package com.bolin.service;

import com.bolin.dao.UserMapper;
import com.bolin.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    /**
     * 查询所有用户
     */
    public List<User> findAll(){
        return userMapper.findAll();
    };

    /**
     * 更新用户
     */
    public void update(User user){
        userMapper.update(user);
    };

    /**
     * 根据 id 查询用户
     */

    public User findById(Integer id){
        return userMapper.findById(id);
    };
}
