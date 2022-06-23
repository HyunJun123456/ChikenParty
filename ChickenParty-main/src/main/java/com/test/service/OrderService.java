package com.test.service;



import java.util.List;

import com.test.dto.OrderDto;

public interface OrderService {
	public int getOrder(OrderDto dto);
	
	public List<OrderDto> OrderInfo();
	
 
}
