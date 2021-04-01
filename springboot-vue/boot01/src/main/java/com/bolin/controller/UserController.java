package com.bolin.controller;

import com.bolin.pojo.User;
import com.bolin.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("findAll")
    public Object findAll(){
    return userService.findAll();
    }

    @RequestMapping("find_by_id")
    public Object findById(Integer id){
        return userService.findById(id);
    }

    @RequestMapping("update")
    public void update(@RequestBody User user){ // @RequestBody返回json
        userService.update(user);
    }



}
