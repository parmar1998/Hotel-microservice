package com.user.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloabalExceptionHandler {
	// This method will run when resource not found exception is thrown
	// This below annotation is going to notice that resourcenotfoundexception is
	// thrown
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotfoundException(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponse response = ApiResponse.builder().message(message).success(true).httpStatus(HttpStatus.NOT_FOUND)
				.build();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}
