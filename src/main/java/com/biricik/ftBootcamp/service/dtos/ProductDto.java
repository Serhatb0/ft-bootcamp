package com.biricik.ftBootcamp.service.dtos;

import java.util.Date;
import java.util.List;

import com.biricik.ftBootcamp.entities.Comment;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDto {

	private int id;

	private String productName;

	private Double price;

	private Date expirationDate;
	
	List<Comment> comments;
}
