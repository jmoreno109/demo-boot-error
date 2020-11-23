package com.example.demo.error;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super("Usuario con ID:" + message + " no encontrado");
	}

}
