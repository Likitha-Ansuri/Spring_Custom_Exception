package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandlers {
	@ExceptionHandler(CustomeException.class)
	public ResponseEntity<Object> myMessage(CustomeException c) {
		return new ResponseEntity<>(c.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
