package com.ye.erkclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ye.erkclient.feignClient.HelloClient;


@RestController
public class HelloController {
	@Autowired
	HelloClient helloClient;
	@Autowired
	DiscoveryClient client;
	@RequestMapping("/getHello")
	public String hello() {
		List test=client.getInstances("HelloClient");
		return helloClient.hello();
	}

}
