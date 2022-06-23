package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.OrderDto;
import com.test.mapper.OrderMapper;
@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public int getOrder(OrderDto dto) {
		return orderMapper.getOrder(dto);
	}

	@Override
	public List<OrderDto> OrderInfo() {
		return orderMapper.OrderInfo();
	}

}
