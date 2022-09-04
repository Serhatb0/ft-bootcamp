package com.biricik.ftBootcamp.entities;


import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.biricik.ftBootcamp.core.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="products")
@EqualsAndHashCode(callSuper = false)
public class Product extends BaseEntity {

	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "expiration_date")
	private Date expirationDate;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	List<Comment> comments;
	
	
}
