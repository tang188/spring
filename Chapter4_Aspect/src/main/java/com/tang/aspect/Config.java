package com.tang.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.tang.aspect.aspectBean.Audience;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Config {

	@Bean
	public Audience audience() {
		return new Audience();
	}
	
}
