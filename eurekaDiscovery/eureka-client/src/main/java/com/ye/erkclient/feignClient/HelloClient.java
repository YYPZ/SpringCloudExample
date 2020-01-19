package com.ye.erkclient.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ye.erkclient.feignClient.hystrix.HelloClientHystrix;
@FeignClient(name="eureka-serviceProvider",path="/eureka-serviceProvider",fallback=HelloClientHystrix.class)
public interface HelloClient {
	@RequestMapping(value = "/getHello")
	String hello();
}