package com.pci.data.exception;

public class BusinessException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1763258672606908453L;

	public BusinessException(){
        super();
    }
	
	public BusinessException(String message){
        super(message);
    }

}
