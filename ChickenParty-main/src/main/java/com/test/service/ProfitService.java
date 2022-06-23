package com.test.service;

import java.util.List;

import com.test.dto.ProfitDto;

public interface ProfitService {
    List<ProfitDto> getMonthlyProfit(String userId);
    List<ProfitDto> getProfitByStore();
    List<ProfitDto> getMonthProfit(int month);
}
