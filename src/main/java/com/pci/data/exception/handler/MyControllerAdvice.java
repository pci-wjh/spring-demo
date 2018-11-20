package com.pci.data.exception.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pci.data.exception.MyException;

/**
 * controller 增强器
 * @author wangjinhui
 * @date 2018年11月13日 上午8:56:19
 */
@ControllerAdvice
public class MyControllerAdvice {
	
	/**
	 * 全局异常捕获处理
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value=Exception.class)
	public Map errorHandler(Exception ex){
		Map map = new HashMap<>();
		map.put("code", 100);
	    map.put("msg", ex.getMessage());
	    return map;
	}
	
	/**
	 * 拦截捕捉自定义异常 MyException.class
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(value = MyException.class)
	public ModelAndView myErrorHandler(MyException ex) {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("error");
	    modelAndView.addObject("code", ex.getCode());
	    modelAndView.addObject("msg", ex.getMsg());
	    return modelAndView;
	}
	
	

}
