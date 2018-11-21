package com.pci.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pci.data.common.config.ConfigBean;
import com.pci.data.common.config.UserConfig;

/**
 * first demo
 * @author wangjinhui
 * @date 2018年11月21日 上午11:45:22
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class,UserConfig.class})
public class HelloController {
	
	@Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/lucy")
    public String lucy(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }

    @RequestMapping(value = "/miya")
    public String miya(){
        return name+":"+age;
    }
	
	
	@RequestMapping("/")
	public String index(){
		return "Greetings from Spring Boot!";
	}
	
	
	@Autowired
	//@Qualifier("userConfig")
    UserConfig userConfig;
	
    @RequestMapping(value = "/user")
    public String user(){
        return userConfig.getName()+userConfig.getAge();
    }

}
