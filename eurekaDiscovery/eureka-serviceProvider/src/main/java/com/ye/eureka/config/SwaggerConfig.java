package com.ye.eureka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2  //管理页面访问路径：http://yepc:9004/eureka-serviceProvider/swagger-ui.html
public class SwaggerConfig {
	
	  @Bean
	   public Docket docket(){
	       return new Docket(DocumentationType.SWAGGER_2)
	         .apiInfo(apiInfo())
	         .select()
	         .apis(RequestHandlerSelectors.basePackage("com.ye.eureka.controller"))
	         .paths(PathSelectors.any())
	         .build();
	   }
	   
	   public ApiInfo apiInfo(){
	       return new ApiInfoBuilder()
	         .title("利用swagger2构建的一叶扁舟API文档")
	         .description("一叶扁舟用restful风格写接口")
	         .termsOfServiceUrl("")
	         .version("1.0")
	         .build();
	   }

}
