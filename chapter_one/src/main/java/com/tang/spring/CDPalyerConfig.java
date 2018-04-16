package com.tang.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tang.spring.bean.CDPlayer;
import com.tang.spring.bean.SgtPeppers;
import com.tang.spring.service.CompactDisc;

@Configuration
@ComponentScan
public class CDPalyerConfig {

	@Bean
	public CompactDisc sgtSgtPeppers() {
		return new SgtPeppers();
	}
	@Autowired
	private CompactDisc cd;
//	@Bean
//	public CDPlayer cdPlayer() {
//		return new CDPlayer(cd);
//	}
}
