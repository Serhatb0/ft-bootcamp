package com.biricik.ftBootcamp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
@Getter
@Setter
public class CustomException extends RuntimeException{

	
	private static final long serialVersionUID = 6158443734275883814L;
	
	private final HttpStatus status;
	
	public CustomException(String message,HttpStatus status) {
		super(message);
		this.status = status;
	}


	



}

