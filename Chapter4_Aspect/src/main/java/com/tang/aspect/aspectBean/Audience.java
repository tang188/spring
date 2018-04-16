package com.tang.aspect.aspectBean;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

	private static final Logger logger = LogManager.getLogger(Audience.class);
	@Before("execution(** com.tang.aspect.Performance.perform(..))")
	public void silenceCellPhones() {
		logger.error("------->> Silencing cell phones");
	}
	
	@Before("execution(** com.tang.aspect.Performance.perform(..))")
	public void takeSeats() {
		logger.error("------->> Taking seats");
	}
	
	@Before("execution(** com.tang.aspect.Performance.perform(..))")
	public void applause() {
		logger.error("------->> CLAP CLAP CLAP!!!");
	}
	
	@Before("execution(** com.tang.asepct.Performance.perform(..))")
	public void demandRefund() {
		logger.error("------->> Demanding a refund");
	}
}
