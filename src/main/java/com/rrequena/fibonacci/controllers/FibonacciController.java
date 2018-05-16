/**
 * @#FibonacciController.java
 */
package com.rrequena.fibonacci.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rrequena.fibonacci.models.RespondApi;
import com.rrequena.fibonacci.services.FibonacciService;

/**
 * The class <code>com.rrequena.fibonacci.controllers.FibonacciController</code> its
 * responsible of expose all end-points methods for the API 
 * 
 * @author Roberto Requena - (rart3001@gmail.com)
 * @version 1.0
 * @since 05/15/2018
 *  
 */
@RestController
@RequestMapping(path="/api/v1/fibo")
public class FibonacciController {
	
	/**
	 * Represent the logger instance
	 */
	Logger LOG = LoggerFactory.getLogger(FibonacciController.class.getName());
	
	/**
	 * Represent the service instance
	 */
	@Autowired
	private FibonacciService fibonacciService;

	/**
	 * Controller
	 */
	public FibonacciController() {
		super();
	}
	
	/**
	 * Default method get call
	 * @return string message
	 */
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("I am Working! ;)");
	}

	/**
	 * Calculate the fibonacci number for the value
	 * pass for parameter
	 * 
	 * @param num
	 * @return ResponseApi
	 */
	@RequestMapping(path="/{num}",method=RequestMethod.GET)
	public ResponseEntity<RespondApi> calculate(@PathVariable Integer num){
		
		LOG.info("Calculate fibonacci for number: {} ", num);
		Long result = fibonacciService.fibonacci(num);
		Long previous = fibonacciService.fibonacci(num-1);

		LOG.info("The fibonacci number is: {} ", result);

		return ResponseEntity.ok(new RespondApi(result, previous));

	}
	
}
