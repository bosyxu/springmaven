package com.howellxu.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AudienceAnno {
	 @Pointcut(
		        "execution(* com.howellxu.aop.Actor.perform(..))")
	public void performance(){
		
	}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Audience Taking Seats");
	}
	@Before("performance()")
	public void turnOffCellphones(){
		System.out.println("Audience turnOffCellphones");
	}
	@After("performance()")
	public void applaud(){
		System.out.println("Audience applauding");
	}
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("We wand our Money back");
	}
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try{
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turn off their cellphones.");
			long start=System.currentTimeMillis();
			joinpoint.proceed();                          //必须调用，否则会阻止被通知方法的调用
			
			Thread.sleep(5);
			long end= System.currentTimeMillis();
			System.out.println("clap clap!");
			System.out.println("took:" + (end - start) + "ms");
			
		}catch(Throwable e){
			System.out.println("perform failed!we want our money back!");
		}
	}
}
