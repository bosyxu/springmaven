package com.howellxu.aop;
import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats(){
		System.out.println("Audience Taking Seats");
	}
	
	public void turnOffCellphones(){
		System.out.println("Audience turnOffCellphones");
	}
	
	public void applaud(){
		System.out.println("Audience applauding");
	}
	
	public void demandRefund(){
		System.out.println("We wand our Money back");
	}
	
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
