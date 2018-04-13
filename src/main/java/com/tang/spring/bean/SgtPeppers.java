package com.tang.spring.bean;

import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.tang.spring.service.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc{

	private static final Logger logger = LoggerFactory.getLogger(SgtPeppers.class);
	private String singer = "Adele";

	public void play() {
		logger.info("logger£º the singer is "+singer);
		System.err.println("the singer is "+singer);
	}
	
}
