package com.hcl.exercise;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		
		 int sum = 0;
	     int i = 0;

	      while (i < list.size()) {
	         sum += list.get(i);
	         i++;
	      }
       
		System.out.println("The sum of given integers is :" +sum);

	}

}
