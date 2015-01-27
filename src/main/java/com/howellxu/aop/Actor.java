package com.howellxu.aop;

public class Actor implements Act{
	public String perform(String str)
	{
		System.out.println("performing");
		return str;
	}
}
