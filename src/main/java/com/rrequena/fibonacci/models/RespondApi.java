/**
 * @#RespondApi.java
 */
package com.rrequena.fibonacci.models;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The class <code>com.rrequena.fibonacci.models.RespondApi</code> its
 * responsible of hold and structure the data of the responds
 * 
 * @author Roberto Requena - (rart3001@gmail.com)
 * @version 1.0
 * @since 05/15/2018
 *  
 */
public class RespondApi implements Serializable {

	/**
	 * Serial version UID value
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Represent the value
	 */
	private Long value;
	
	/**
	 * Represent the previousValue
	 */
	private Long previousValue;
	
	/**
	 * Represent the timestamp
	 */
	private Timestamp timestamp;
	
	
	/**
	 * Constructor
	 */
	public RespondApi() {
		super();
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}
	
	
	/**
	 * Constructor with parameters
	 * @param value
	 */
	public RespondApi(Long value, Long previousValue) {
		super();
		this.value = value;
		this.previousValue = previousValue;
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}


	/**
	 * @return the value
	 */
	public Long getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(Long value) {
		this.value = value;
	}

	

	/**
	 * @return the previousValue
	 */
	public Long getPreviousValue() {
		return previousValue;
	}


	/**
	 * @param previousValue the previousValue to set
	 */
	public void setPreviousValue(Long previousValue) {
		this.previousValue = previousValue;
	}


	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}


	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
}
