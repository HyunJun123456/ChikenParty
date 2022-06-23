package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.dto.ProfitDto;

@Mapper
public interface ProfitMapper {
	
	@Select(" SELECT month, sum(profit) as profit FROM profit WHERE userId = #{userId} group by month ORDER By month asc ")
	List<ProfitDto> getMonthlyProfit(String userId);
	
	@Select(" SELECT SUM(profit) as profit, userId FROM profit GROUP BY userId ")
	List<ProfitDto> getProfitByStore();
	
	@Select(" SELECT userId, profit FROM profit WHERE month = #{month}")
	List<ProfitDto> getMonthProfit(int month);
}
