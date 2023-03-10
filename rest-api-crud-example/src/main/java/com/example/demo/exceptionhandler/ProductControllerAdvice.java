package com.example.demo.exceptionhandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ProductControllerAdvice {

	@ResponseBody
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MessageExceptionHandler> productNotFound(ProductNotFoundException productNotFound){
		MessageExceptionHandler error = new MessageExceptionHandler(
			new Date(),HttpStatus.NOT_FOUND.value(),"Dados não encontrados");
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
 }		
	public ResponseEntity<MessageExceptionHandler> productAlreadyExist(ProductAlreadyExist productAlreadyExist){
		MessageExceptionHandler error = new MessageExceptionHandler(
				new Date(),HttpStatus.BAD_REQUEST.value(),"Marca inexistente");
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		
	}
}
