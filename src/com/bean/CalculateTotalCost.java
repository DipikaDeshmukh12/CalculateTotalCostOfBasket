package com.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Dipika Deshmukh
 * 
 *         Class for calculating total cost of fruit basket
 */
public class CalculateTotalCost {

	/**
	 * @param basket
	 *            : list of fruits
	 * @return total : total cost of basket
	 */
	public static int totalCostOfFruits(List basket) {
		int total = 0;

		Iterator<Fruit> it = basket.iterator();
		while (it.hasNext()) {
			Fruit fruit = it.next();
			total = total
					+ fruit.getCost(fruit.getPrice(), fruit.getQuantity());
		}
		return total;
	}

}
