package com.john.string.text.token;

public class Number extends Token{
	private int number;
	
	public Number(String number) {
		this.number = Integer.parseInt(number);
	}
	
	@Override
	public String toString() {
		return Integer.toString(number);
	}
}
