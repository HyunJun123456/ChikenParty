package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.ProductDto;
import com.test.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<ProductDto> getStoredList(String userId) {
		return productMapper.getStoredList(userId);
	}

	@Override
	public List<ProductDto> getStoredByUser() {
		return productMapper.getStoredByUser();
	}

}
