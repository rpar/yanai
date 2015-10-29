package com.ravi.test;

import java.util.ArrayList;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
//		list.add("Test");
		
//		System.out.println(list);
//		for(String s : list)
//		{
//			System.out.println(s);
//		}


		String csvStr = "test,rest,nest";
		String [] strArray = csvStr.split(",");
		for(String s : strArray)
		{
			System.out.println(s);
		}
		
		
	}
}
