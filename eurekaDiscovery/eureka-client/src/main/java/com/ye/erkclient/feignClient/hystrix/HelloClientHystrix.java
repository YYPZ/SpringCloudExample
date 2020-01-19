package com.ye.erkclient.feignClient.hystrix;

import org.springframework.stereotype.Component;

import com.ye.erkclient.feignClient.HelloClient;


@Component
public class HelloClientHystrix implements HelloClient{


	@Override
	public String hello() {
		 return "hello "+", this messge send failed ";
	}
}