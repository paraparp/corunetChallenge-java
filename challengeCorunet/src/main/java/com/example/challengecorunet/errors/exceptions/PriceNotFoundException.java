package com.example.challengecorunet.errors.exceptions;

public class PriceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public PriceNotFoundException() {
		super("Price not found");

	}
}