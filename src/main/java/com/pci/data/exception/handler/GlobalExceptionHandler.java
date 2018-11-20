package com.pci.data.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pci.data.common.resp.AppResponse;
import com.pci.data.exception.BusinessException;

/**
 * 全局Controller异常处理类
 * @author wangjinhui
 * @date 2018年11月12日 下午2:36:25
 */
//@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	/*@ExceptionHandler()
	@ResponseBody
	AppResponse handlerException(Exception e){
		LOGGER.error(e.getMessage(), e);

        AppResponse response = new AppResponse();
        response.setFail("操作失败！");
        return response;

	}
	
	*//**
     * 处理所有业务异常
     *
     * @param e
     * @return
     *//*
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    AppResponse handleBusinessException(BusinessException e){
        LOGGER.error(e.getMessage(), e);
        AppResponse response = new AppResponse();
        response.setFail(e.getMessage());
        return response;
    }

    *//**
     * 处理所有接口数据验证异常
     *
     * @param e
     * @return
     *//*
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    AppResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        LOGGER.error(e.getMessage(), e);

        AppResponse response = new AppResponse();
        response.setFail(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        return response;
    }*/

}
