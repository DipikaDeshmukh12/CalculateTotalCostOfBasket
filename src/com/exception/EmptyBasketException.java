package com.exception;

public class EmptyBasketException extends Exception{
	
	public EmptyBasketException(){
		super("There is no fruit in basket");
	}

}
