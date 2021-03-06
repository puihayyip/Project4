package com.puihay.project4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Project4Application {

	public static void main(String[] args) {
		SpringApplication.run(Project4Application.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**").allowedOrigins("https://project4-beryl.vercel.app/")
						.allowedMethods("*")
						.allowedHeaders("*");
			}
		};
	}
}