package com.howellxu.simple;

public class SimpleHello {
	
	private String talker;
	
	public void says()
	{
		System.out.println(talker + ":hello ok!");
	}

	
	
	public String getTalker() {
		return talker;
	}

	public void setTalker(String talker) {
		this.talker = talker;
	}
	
	
}
