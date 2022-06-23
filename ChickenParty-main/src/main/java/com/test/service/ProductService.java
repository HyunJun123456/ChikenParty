package com.test.service;

import java.util.List;

import com.test.dto.ProductDto;

public interface ProductService {
	public List<ProductDto> getStoredList(String userId);

	public List<ProductDto> getStoredByUser();
}
