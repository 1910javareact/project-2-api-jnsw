package com.revature.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
	@Override//this is cors for an application level
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // all endpoints in the api
            .allowedOrigins("http://top-chat.s3-website-us-east-1.amazonaws.com/", "http://localhost:3000", "http://3.85.168.106:8888/topic/home")
            .allowedMethods("PUT", "DELETE", "GET", "OPTIONS", "POST", "PATCH")
            .allowedHeaders("header1", "Content-Type", "Authorization")
            //.exposedHeaders("header1", "header2")
            .allowCredentials(true);
    }
}
