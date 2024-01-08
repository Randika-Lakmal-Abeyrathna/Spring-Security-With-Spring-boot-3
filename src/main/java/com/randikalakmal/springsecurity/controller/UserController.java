package com.randikalakmal.springsecurity.controller;

import com.randikalakmal.springsecurity.entity.UserInfo;
import com.randikalakmal.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return userService.addUser(userInfo);
    }


}
