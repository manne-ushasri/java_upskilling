package com.hcl.exercise;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Ganga");
		list.add("Yamuna");
		list.add("Narmada");
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		
	}

}
