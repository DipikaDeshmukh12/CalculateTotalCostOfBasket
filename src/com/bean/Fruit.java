package com.bean;

/**
 * @author Dipika Deshmukh
 * 
 *         This is a Parent class, It has common attributes and method for all
 *         fruits
 */
public class Fruit {

	public int price;
	public int quantity;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param price
	 * @param quantity
	 * @return
	 */
	public int getCost(int price, int quantity) {
		if (price != 0 && quantity != 0)
			return price * quantity;
		else
			return 0;
	}
}
