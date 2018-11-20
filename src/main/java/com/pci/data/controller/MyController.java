package com.pci.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pci.data.exception.MyException;

/**
 * 测试控制中心
 * @author wangjinhui
 * @date 2018年11月13日 上午9:02:32
 */
@RestController
public class MyController {

	@RequestMapping("/home")
	public String home() throws Exception{
		throw new MyException("101", "Sam 错误");
	}
	
}
