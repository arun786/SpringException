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
	public final ResponseEntity<PersonNotFoundException> handleCreateDataException(PersonNotFoundException e,
			WebRequest request) {
		PersonNotFoundException response = new PersonNotFoundException(e.getMessage());
		ResponseEntity<PersonNotFoundException> responseEntity = new ResponseEntity<PersonNotFoundException>(response,
				HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}

}
