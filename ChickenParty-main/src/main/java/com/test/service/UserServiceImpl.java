package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.UserDto;
import com.test.mapper.UserMapper;

@Service

public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<UserDto> info() {
		
		return userMapper.info();
		
	}

	@Override
	public UserDto infoChain(String userId) {
		return userMapper.infoChain(userId);
	}
	

 	

}
