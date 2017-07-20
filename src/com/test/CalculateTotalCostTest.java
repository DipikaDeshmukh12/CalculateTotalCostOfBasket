package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.bean.Apple;
import com.bean.Banana;
import com.bean.CalculateTotalCost;
import com.bean.Fruit;
import com.bean.Lemon;
import com.bean.Orange;

/**
 * @author Dipika Deshmukh
 * 
 *         Test class for calculating total cost of basket items
 */
public class CalculateTotalCostTest {

	/**
	 * Positive Test
	 */
	@Test
	public void positiveTest() {
		List<Fruit> basket = new ArrayList<Fruit>();

		basket.add(new Banana(5, 12));
		basket.add(new Orange(10, 21));
		basket.add(new Lemon(4, 5));
		basket.add(new Apple(15, 10));
		assertEquals(440, CalculateTotalCost.totalCostOfFruits(basket));
	}

	/**
	 * Negative Test
	 */
	@Ignore
	public void negativeTest() {
		List<Fruit> basket = new ArrayList<Fruit>();

		basket.add(new Banana(5, 12));
		basket.add(new Orange(10, 21));
		basket.add(new Lemon(4, 5));
		basket.add(new Apple(15, 10));
		assertEquals(430, CalculateTotalCost.totalCostOfFruits(basket));
	}

}
