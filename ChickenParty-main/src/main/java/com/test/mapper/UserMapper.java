package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.dto.BoardDto;
import com.test.dto.UserDto;


	@Mapper
	public interface UserMapper {
		@Select(" SELECT * FROM MYUSER WHERE userId=#{userId} ") 
		UserDto infoChain(String userId);
		
		
		@Select(" SELECT userNm, userAddr, userTel FROM MYUSER")
		List<UserDto> info();
		
	}

