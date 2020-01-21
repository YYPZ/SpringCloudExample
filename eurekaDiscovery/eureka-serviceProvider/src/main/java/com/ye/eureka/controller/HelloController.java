package com.ye.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
//post请求刷新值 http://localhost:8005/eureka-serviceProvider/actuator/refresh 
@RefreshScope
public class HelloController {
	@Value("${spring.application.instance_id}")
	private String instanceId;
	
	@Value("${environment.active}")
	private String environment;
	
	@RequestMapping("/getHello")
	public String hello() {
		return "hello from " +instanceId+" "+environment;
	}

}
