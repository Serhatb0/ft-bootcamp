package com.biricik.ftBootcamp.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.biricik.ftBootcamp.util.MethodUtils;

@RestControllerAdvice
public class CustomExceptionHandler {

	 @ExceptionHandler({CustomException.class})
	    public ResponseEntity<Object> applicationException(CustomException exception, WebRequest request) {
	        return new ResponseEntity<>(MethodUtils.prepareErrorJSON(exception.getStatus(), exception), exception.getStatus());
	    }
	    

}