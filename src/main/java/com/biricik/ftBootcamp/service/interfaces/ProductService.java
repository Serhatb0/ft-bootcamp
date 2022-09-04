package com.biricik.ftBootcamp.service.interfaces;

import java.util.List;

import com.biricik.ftBootcamp.service.dtos.ProductDto;

public interface ProductService {
	List<ProductDto> findByExpirationDateBefore();
	
	List<ProductDto> findByExpirationDateBeforeOrExpirationDateIsNull();

	List<ProductDto> expiredProducts();

	List<ProductDto> expiredProductsIsNull();
}
