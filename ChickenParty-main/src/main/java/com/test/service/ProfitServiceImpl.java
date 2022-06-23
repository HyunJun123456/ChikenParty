package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.ProfitDto;
import com.test.mapper.ProfitMapper;

@Service
public class ProfitServiceImpl implements ProfitService{

	@Autowired
	private ProfitMapper profitMapper;
	
	@Override
	public List<ProfitDto> getMonthlyProfit(String userId) {
		return profitMapper.getMonthlyProfit(userId);
	}

	@Override
	public List<ProfitDto> getProfitByStore() {
		return profitMapper.getProfitByStore();
	}
	
	@Override
	public List<ProfitDto> getMonthProfit(int month){
		return profitMapper.getMonthProfit(month);
	}

}
