package com.altimetrik.inventoryManagement.configurations;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
	@EnableSwagger2
	public class SwaggerConfig {
	public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Battery Bank inventory System")
            .description("Battery Bank inventory System")
            .license("altimatrik")
            .licenseUrl("http://altimetrik.batterybank.com/license")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", "ibanerjee@altimetrik.com"))
            .build();
    }    
	@Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select().apis(RequestHandlerSelectors.basePackage("com.altimetrik.inventoryManagement"))
	                .paths(regex("/*"))
	                .build()
	                .apiInfo(apiInfo());
	    }
	}

