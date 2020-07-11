package com.ye.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
// 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
// post请求刷新值 http://localhost:8005/eureka-serviceProvider/actuator/refresh
@RefreshScope
@Api(value = "测试swagger类",tags="测试swagger类")
public class HelloController {
	@Value("${spring.application.instance_id}")
	private String instanceId;

	@Value("${environment.active}")
	private String environment;

	@RequestMapping("/getHello")
	@ApiOperation(value = "获取打招呼信息", notes = "根据环境获取打招呼信息")
	public String hello(@ApiParam(name="name",value="名字",required=true)String name) {
		return "hello from "+name+"  " + instanceId + " " + environment;
	}

}
