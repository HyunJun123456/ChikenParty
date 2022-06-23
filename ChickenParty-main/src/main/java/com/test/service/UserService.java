package com.test.service;

import java.util.List;

import com.test.dto.UserDto;

public interface UserService{
	public List<UserDto> info();
	public UserDto infoChain(String userId);
}