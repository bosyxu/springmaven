package com.howellxu.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@interface MyAnno{
	String str();
	int val();
}


public class Meta {
	@MyAnno(str="Annotation example",val =100)
	public static void myMeth(){
		Meta ob = new Meta();
		
		try{
			Class<?> cl = ob.getClass();
			Method method = cl.getMethod("myMeth");
			
		}catch(Exception e){
			
		}

	}
	
	
	public static void main(String[] args) {
		
		

	}

}
