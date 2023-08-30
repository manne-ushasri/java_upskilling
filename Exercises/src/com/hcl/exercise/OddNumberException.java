package com.hcl.exercise;

public class OddNumberException extends Exception {

	OddNumberException() {
		super("Invalid input:Odd number ");
	}

	OddNumberException(String msg) {
		super(msg);
	}

}
