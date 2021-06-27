package com.nagarro.test;

import com.nagarro.services.AdditionService;

import junit.framework.*;

public class AppTest extends TestCase {

	AdditionService additionService = new AdditionService();

	public AppTest(String name) {
		super(name);
	}

	public void testSum() {
		assertEquals(2, additionService.addNumbers(1, 1));
	}
	
	public void testNegativeSum() {
		assertEquals(-2, additionService.addNumbers(-1, -1));
	}
}
