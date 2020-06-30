package com.mythical.rosefinch.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.rosefinch.business.core.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mythical.rosefinch.entity.bean.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserClient userClient;
	
	@RequestMapping("/getAllUser")
    public List<User> getAllUser() {
		Map<String, Object> m = new HashMap<String, Object>();
        return userClient.getUser(m);
    }
}
