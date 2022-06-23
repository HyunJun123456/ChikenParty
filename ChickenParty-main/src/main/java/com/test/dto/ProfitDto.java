package com.test.dto;

public class ProfitDto {
	private int month;
	private int profit;
	private String userId;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ProfitDto [month=" + month + ", profit=" + profit + ", userId=" + userId + "]";
	}
	public ProfitDto(int month, int profit, String userId) {
		super();
		this.month = month;
		this.profit = profit;
		this.userId = userId;
	}
	public ProfitDto() {
		super();
	}
	
	
}
