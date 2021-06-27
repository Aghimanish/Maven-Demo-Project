package com.nagarro.services;

import org.springframework.stereotype.Service;

/**
 * @author jatinkumar02
 *
 *Addition service to perform addition
 *of two numbers
 */
@Service
public class AdditionService {

	/**
	 * @param num1
	 * @param num2
	 * @return result of num1 + num2 
	 */
	public int addNumbers(int num1, int num2) {
		
		return num1 + num2;
		
	}
}
