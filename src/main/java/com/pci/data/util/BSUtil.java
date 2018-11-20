package com.pci.data.util;

import com.pci.data.exception.BusinessException;

public class BSUtil {
	
	public static void isTrue(boolean expression, String error){
	    if(!expression) {
	        throw new BusinessException(error);
	    }
	}

}
