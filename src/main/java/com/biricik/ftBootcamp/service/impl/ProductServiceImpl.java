package com.biricik.ftBootcamp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.biricik.ftBootcamp.entities.Product;
import com.biricik.ftBootcamp.exception.CustomException;
import com.biricik.ftBootcamp.mappers.ProductMapper;
import com.biricik.ftBootcamp.repositories.ProductRepository;
import com.biricik.ftBootcamp.service.dtos.ProductDto;
import com.biricik.ftBootcamp.service.interfaces.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	private final ProductMapper productMapper;

	public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
		this.productRepository = productRepository;
		this.productMapper = productMapper;
	}

	@Override
	public List<ProductDto> findByExpirationDateBefore() {
		List<Product> products = productRepository.findByExpirationDateBefore(new Date());

		if (products.isEmpty()) {
			throw new CustomException("Product Not Found", HttpStatus.NOT_FOUND);
		}

		return productMapper.toResponses(products);

	}

	@Override
	public List<ProductDto> findByExpirationDateBeforeOrExpirationDateIsNull() {
		List<Product> products = productRepository.findByExpirationDateBeforeOrExpirationDateIsNull(new Date());

		if (products.isEmpty()) {
			throw new CustomException("Product Not Found", HttpStatus.NOT_FOUND);
		}

		return productMapper.toResponses(products);
	}

	@Override
	public List<ProductDto> expiredProducts() {
		List<Product> products = productRepository.expiredProducts();

		if (products.isEmpty()) {
			throw new CustomException("Product Not Found", HttpStatus.NOT_FOUND);
		}

		return productMapper.toResponses(products);
	}

	@Override
	public List<ProductDto> expiredProductsIsNull() {
		List<Product> products = productRepository.expiredProductsIsNull();

		if (products.isEmpty()) {
			throw new CustomException("Product Not Found", HttpStatus.NOT_FOUND);
		}

		return productMapper.toResponses(products);
	}

}
