/**
 * 
 */
package com.rrequena.fibonacci.services;

import org.springframework.stereotype.Service;

/**
 * The class <code>com.rrequena.fibonacci.services.FibonacciService</code> its
 * responsible hold all business logic 
 * 
 * @author Roberto Requena - (rart3001@gmail.com)
 * @version 1.0
 * @since 05/15/2018
 *  
 */
@Service
public class FibonacciService {

	/**
	 * Constructor
	 */
	public FibonacciService() {
		super();
	}
	
	/**
	 * Method that calculate the fibonacci number for
	 * a number passed by parameter
	 * 
	 * @param num
	 * @return fibonacci number
	 */
	public Long fibonacci(int num){
				
		Long seedA = 0l;
		Long seedB = 1l;
		Long temp  = 0l;
		
		for (int k = 0; k < num; k++) {
			temp = seedA + seedB;
			seedA = seedB;
			seedB = temp;
		}
		
		return seedA;
				
	}
	
	/**
	 * Validate is the number pass for parameters
	 * is odd
	 * 
	 * @param num
	 * @return true or false
	 */
	public boolean isOdd(int num) {
		return ((num % 2) == 1);
		
	}

}
