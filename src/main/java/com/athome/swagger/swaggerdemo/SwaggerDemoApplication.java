package com.athome.swagger.swaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.athome")
public class SwaggerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerDemoApplication.class, args);
	}

}
