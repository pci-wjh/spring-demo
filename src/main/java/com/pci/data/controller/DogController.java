package com.pci.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pci.data.common.resp.AppResponse;
import com.pci.data.common.validates.Update;
import com.pci.data.entity.Dog;
import com.pci.data.service.DogService;

/**
 * 狗狗控制类
 * @author wangjinhui
 * @date 2018年11月12日 下午2:45:06
 */
@RestController
@RequestMapping(value="/dogs" , consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class DogController {
	
	@Autowired
	private DogService dogService;
	
	@PostMapping(value = "")
	AppResponse update(@Validated(Update.class) @RequestBody Dog dog){
		AppResponse resp = new AppResponse();
        // 执行业务
        Dog newDog = dogService.update(dog);

        // 返回数据
        resp.setData(newDog);

        return resp;
	}

}
