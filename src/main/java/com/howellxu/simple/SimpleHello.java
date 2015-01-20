package com.howellxu.simple;

public class SimpleHello {
	
	private String talker;
	private SimpleProp prop;
	
	public SimpleHello(String talker){
		this.talker = talker;
	}
	
	public SimpleHello(String talker,SimpleProp prop){
		this.talker = talker;
		this.prop = prop;
	}
	
	
	public void says()
	{
		System.out.println(talker + ":hello ok!" );
		prop.say();
	}

	
/*	
	public String getTalker() {
		return talker;
	}

	public void setTalker(String talker) {
		this.talker = talker;
	}



	public SimpleProp getProp() {
		return prop;
	}



	public void setProp(SimpleProp prop) {
		this.prop = prop;
	}
	*/
	
}
