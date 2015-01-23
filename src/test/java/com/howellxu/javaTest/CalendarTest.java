package com.howellxu.javaTest;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
    	now.add(Calendar.DATE, 3);
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    	String time = formatter.format(now.getTime());
    	String encoded = URLEncoder.encode(time);
    	try{
    	String encoded_utf8 = URLEncoder.encode(time,"utf-8");
    	System.out.println(encoded + "," + encoded_utf8);
    	}catch(Exception e){;}
    	System.out.println(formatter.format(now.getTime()));
    	
    	
	}

}
