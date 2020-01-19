package com.ye.eureka.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
@RestController
public class CommonZuulErrorController  implements ErrorController{



	@RequestMapping("/error")
	public Object error() {
		RequestContext ctx = RequestContext.getCurrentContext();
		ZuulException exception = (ZuulException) ctx.getThrowable();
		JSONObject rspObject= new JSONObject();
		rspObject.put("resCode",String.valueOf(exception.nStatusCode));
		rspObject.put("resMsg",exception.getMessage());
		return rspObject.toJSONString();
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
