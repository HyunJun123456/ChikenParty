package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.ProfitService;

@Controller
@RequestMapping("/profit")
public class ProfitController {
	
	@Autowired
	private ProfitService profitService;
	
	@GetMapping("/getMonthlyProfit")
	public String getMonthlyProfit(Model model, String userId) {
		model.addAttribute("list", profitService.getMonthlyProfit(userId));
		return "monthlyProfit";
	}
	
	@GetMapping("/getProfitByStore")
	public String getProfitByStore(Model model) {
		model.addAttribute("list", profitService.getProfitByStore());
		return "profitByStore";
	}
	
	@GetMapping("/getMonthProfit")
	public String getMonthProfit(Model model , int month) {
		model.addAttribute("list", profitService.getMonthProfit(month));
		return "profitByStore";
	}
}
