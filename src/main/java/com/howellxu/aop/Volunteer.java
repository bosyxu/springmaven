package com.howellxu.aop;

public class Volunteer implements Thinker {
	private String thoughts;
	
	public void thinkOfSomething(String thoughts) {
		// TODO Auto-generated method stub
		this.thoughts = thoughts;
	}
	
	public String getThoughts(){
		return thoughts;
	}

}
