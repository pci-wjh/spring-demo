package com.pci.data.exception;

/**
 * 统一异常处理类
 * @author wangjinhui
 * @date 2018年11月13日 上午8:54:16
 */
public class MyException extends RuntimeException {
	public MyException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private String code;
	private String msg;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
