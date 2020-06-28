package com.mythical.rosefinch.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mythical.rosefinch.business.service.UserService;
import com.mythical.rosefinch.entity.bean.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
