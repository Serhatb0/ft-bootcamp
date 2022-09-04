package com.biricik.ftBootcamp.service.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CommentDto {
	
	private int id;
	
	private String comment;
	
	private Date createdDate;
	
	
}
