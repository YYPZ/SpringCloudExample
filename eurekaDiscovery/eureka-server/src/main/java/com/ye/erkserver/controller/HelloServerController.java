package com.ye.erkserver.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloServerController {

	@Autowired
	DiscoveryClient client;

	@RequestMapping("/getHello")
	public UserEntity hello(@RequestBody(required=false) UserEntity user) {
		/*List<String> ff=client.getServices();
		List<ServiceInstance> instances = client.getInstances("HelloServer");
		ServiceInstance selectedInstance = instances.get(new Random().nextInt(instances.size()));
		return "Hello World: " + selectedInstance.getServiceId() + ":" + selectedInstance.getHost() + ":"
				+ selectedInstance.getPort();
		try {
			long l=System.currentTimeMillis();
			System.out.println(l+" start ");
			Thread.sleep(5000);
			System.out.println(l+" over ");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String ff=null;
		if (user !=null) {
			System.err.println(user.getName() + user.getAge());
		}else {
			user=new UserEntity();
			user.setName("hhhh");
		}
		
		return user;
	}

}
