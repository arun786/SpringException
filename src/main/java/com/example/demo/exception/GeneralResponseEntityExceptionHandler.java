/**
 * 
 */
package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Adwiti
 *
 */
@ControllerAdvice
@RestController
public class GeneralResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(PersonNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handleCreateDataException(PersonNotFoundException e,
			WebRequest request) {
		ExceptionResponse response = new ExceptionResponse(HttpStatus.NOT_FOUND.toString(), e.getMessage());
		ResponseEntity<ExceptionResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		return responseEntity;
	}

}
