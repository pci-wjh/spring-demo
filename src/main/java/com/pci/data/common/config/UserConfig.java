package com.pci.data.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@PropertySource(value="classpath:test.properties")
@ConfigurationProperties(prefix="com.forezp")
@Data
public class UserConfig {
	 private String name;
	    private int age;
}
