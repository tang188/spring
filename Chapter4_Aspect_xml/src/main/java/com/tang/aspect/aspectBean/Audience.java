package com.tang.aspect.aspectBean;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(** com.tang.aspect.Performance.perform(..))")
	public void performance() {
		
	}
	
	private static final Logger logger = LogManager.getLogger(Audience.class);
	
	@Before("execution(** com.tang.aspect.Performance.perform(..))")
	public void silenceCellPhones() {
		logger.error("------->> Silencing cell phones");
	}
	
	@Before("performance()")
	public void takeSeats() {
		logger.error("------->> Taking seats");
	}
	
	@AfterReturning("execution(** com.tang.aspect.Performance.perform(..))")
	public void applause() {
		logger.error("------->> CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		logger.error("------->> Demanding a refund");
	}
	
}
