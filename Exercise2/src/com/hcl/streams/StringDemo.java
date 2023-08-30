package com.hcl.streams;

import java.util.Arrays;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Usha", "Varsha", "Ishitha","Deepika", "Abhi");
	      System.out.print("List = "+list);
	      System.out.println("Uppercase strings are : ");
	      list.stream().map(names -> names.toUpperCase()) .forEach(names -> System.out.println(names + ""));
	      
	      System.out.println("Lowercase strings are : ");
	      list.stream().map(names -> names.toLowerCase()) .forEach(names -> System.out.println(names + ""));
	}

}
