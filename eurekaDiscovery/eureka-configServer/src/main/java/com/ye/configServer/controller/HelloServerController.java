package com.ye.configServer.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloServerController {
/*
	@Autowired
	DiscoveryClient client;

	@RequestMapping("/getHello")
	public String hello() {
		List<String> ff=client.getServices();
		List<ServiceInstance> instances = client.getInstances("HelloServer");
		ServiceInstance selectedInstance = instances.get(new Random().nextInt(instances.size()));
		return "Hello World: " + selectedInstance.getServiceId() + ":" + selectedInstance.getHost() + ":"
				+ selectedInstance.getPort();
		return "ffffff";
	}*/

}
