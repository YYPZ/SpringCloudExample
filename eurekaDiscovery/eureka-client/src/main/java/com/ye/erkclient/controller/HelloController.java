package com.ye.erkclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ye.erkclient.feignClient.HelloClient;


@RestController
public class HelloController {
	@Autowired
	HelloClient helloClient;
	
	@RequestMapping("/getHello")
	public String hello() {
		return helloClient.hello();
	}

}
