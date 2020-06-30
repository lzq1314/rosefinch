package com.mythical.rosefinch.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mythical.rosefinch.business.mapper.UserMapper;
import com.mythical.rosefinch.entity.bean.User;

@RestController
@RequestMapping("/user")
@Transactional
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/getAllUser")
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	}
	
}
