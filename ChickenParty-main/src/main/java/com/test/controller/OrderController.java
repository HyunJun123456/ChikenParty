package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dto.OrderDto;
import com.test.service.OrderService;
import com.test.service.ProductService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;

	@GetMapping("/orderlist")
	public String order(Model model, String userId, OrderDto dto) {
		
		int res = (orderService.getOrder(dto));
		
		model.addAttribute("product", productService.getStoredList(userId));
		return "storedList";
	}
	 
	@GetMapping("/orderinfo")
	public String orderinfo(Model model) {
		model.addAttribute("product",orderService.OrderInfo());
		return "orderInfo";
	}

}
