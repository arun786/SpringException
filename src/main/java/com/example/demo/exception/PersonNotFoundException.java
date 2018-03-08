/**
 * 
 */
package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * @author Adwiti
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1620167726924007988L;

	public PersonNotFoundException(String message) {
		super(message);
	}

}
