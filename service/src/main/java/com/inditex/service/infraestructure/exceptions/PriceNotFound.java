package com.inditex.service.infraestructure.exceptions;

public class PriceNotFound extends RuntimeException {
	public PriceNotFound(String message) {
		super(message);
	}

}
