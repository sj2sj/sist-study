package com.iu.b5.aop.transfer;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Card {

//	@Before("execution(* com.iu.b5.aop.transfer.Transfer.*(..))")
//	@AfterReturning("execution(* com.iu.b5.aop.transfer.Transfer.*(..))")	
	@Around("execution(* com.iu.b5.aop.transfer.Transfer.*(..))")	
	public Object cardCheck(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("타기 전 card check");
		
		Object obj = joinPoint.proceed();
		
		System.out.println("내릴 때 card check");
		
		return obj;
	}
	
}
