package com.howellxu.javaTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		
		int listSize = 2;
		int size = (int)Math.ceil((list.size()/(double)listSize));

		List<String> subList = new ArrayList<String>();
		for (int i = 0; i < size; i++) {


			int begin = i*listSize;
			int end = list.size() > (i+1)*listSize ? (i+1)*listSize : list.size();
			subList = list.subList(begin, end);
			System.out.println("subList size:" + subList.size());
		}
    	
		
/*		
		subList = list.subList(0, 5);*/
		
	}

}
