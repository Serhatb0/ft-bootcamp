package com.biricik.ftBootcamp.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.biricik.ftBootcamp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	/**
	 * Lists expired products
	 * 
	 * @param currentDate
	 * @return List<Product> 
	 */
	List<Product> findByExpirationDateBefore(Date currentDate);
	
	/**
	 * Lists expired products SQL
	 * 
	 * 
	 * @return List<Product>
	 */
	@Query(nativeQuery = true,
			value = "SELECT * FROM PRODUCTS WHERE EXPIRATION_DATE < NOW()"
			)
	List<Product> expiredProducts();
	
	
	/**
	 *  Lists expired products and null SQL
	 *  
	 *  
	 * @return List<Product>
	 */
	@Query(nativeQuery = true,
			value = "SELECT * FROM PRODUCTS WHERE EXPIRATION_DATE < NOW() OR EXPIRATION_DATE IS NULL"
			)
	List<Product> expiredProductsIsNull();
	
	
	
	/**
	 * Lists expired products and null
	 * 
	 * @param currentDate
	 * @return List<Product> 
	 */
	List<Product> findByExpirationDateBeforeOrExpirationDateIsNull(Date currentDate);
	
	
}
