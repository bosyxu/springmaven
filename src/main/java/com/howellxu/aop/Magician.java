package com.howellxu.aop;

public class Magician implements MindReader {
	private String thoughts;
	public void interceptorThoughts(String thoughts) {
		// TODO Auto-generated method stub
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		// TODO Auto-generated method stub
		return thoughts;
	}

}
