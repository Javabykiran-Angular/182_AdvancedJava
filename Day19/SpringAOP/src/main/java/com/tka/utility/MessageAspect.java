package com.tka.utility;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {

//	@Pointcut("execution (public void deposit())")
//	public void messageSend() {
//		
//	}
//	
//	@After("messageSend()")
//	public void SendSMS() {
//		System.out.println("Sms Send to Client Money is Depoisted......");		
//		
//	}
	
//	@Pointcut("execution (public void withdraw())")
//	public void withdrawMessageSend() {
//		
//	}
//	
//	@Before("withdrawMessageSend()")
//	public void pinValid() {
//		System.out.println("Pin is validated...");
//	}
	
	
	@Pointcut("execution (* com.tka.service.Account.*() )")
	public void applyAllMethod() {
		
	}
	
	@Around("applyAllMethod()")
	public void sendMessage(ProceedingJoinPoint pjpt) {
		// For Before Logic
		System.out.println("===================Pin validation is successfully...========================");
		
		try {
			pjpt.proceed();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Apply After Logic 
		
		System.out.println("----------------------Your Operation done Successfully...----------------------");
		
	}
	
	
	
}
