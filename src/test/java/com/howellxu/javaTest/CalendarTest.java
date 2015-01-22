package com.howellxu.javaTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
    	now.add(Calendar.DATE, 3);
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    	System.out.println(formatter.format(now.getTime()));
	}

}
