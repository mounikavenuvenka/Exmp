
package com.ojas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ojas")

public class AppConfig {
	 @Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/");
		ivr.setPrefix(".jsp");
		return ivr;
		
	}
	 
}
