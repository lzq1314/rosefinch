package org.rosefinch.business.core;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mythical.rosefinch.entity.bean.User;

@FeignClient(name = "rosefinch-business", url = "http://rosefinch-business:8081")
public interface UserClient {

	/* @GetMapping("/user/getAllUser") */
	@RequestMapping("/user/getAllUser")
	public List<User> getUser(@RequestParam Map<String, Object> paramMap);
	
}
