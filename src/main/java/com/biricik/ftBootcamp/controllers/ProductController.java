package com.biricik.ftBootcamp.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biricik.ftBootcamp.service.dtos.ProductDto;
import com.biricik.ftBootcamp.service.interfaces.ProductService;

@RestController
public class ProductController {

	private final ProductService productService;
	
	
	
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/expiredProducts")
	public List<ProductDto> expiredProducts(){
		return productService.expiredProducts();
	}
	
	@GetMapping("/expiredProductsIsNull")
	public List<ProductDto> expiredProductsIsNull(){
		return productService.expiredProductsIsNull();
	}
	

	@GetMapping("/findByExpirationDateBefore")
	public List<ProductDto> findByExpirationDateBefore(){
		return productService.findByExpirationDateBefore();
	}
	
	@GetMapping("/findByExpirationDateBeforeOrExpirationDateIsNull")
	public List<ProductDto> findByExpirationDateBeforeOrExpirationDateIsNull(){
		return productService.findByExpirationDateBeforeOrExpirationDateIsNull();
	}
	
	
}
