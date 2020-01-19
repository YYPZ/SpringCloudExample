package com.ye.erkclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	@Value("${spring.application.instance_id}")
	private String instanceId;
	
	@RequestMapping("/getHello")
	public String hello() {
		return "hello from " +instanceId;
	}

}
