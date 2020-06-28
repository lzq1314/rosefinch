package com.mythical.rosefinch.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mythical.rosefinch.business.mapper.UserMapper;
import com.mythical.rosefinch.entity.bean.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	}
	
}
