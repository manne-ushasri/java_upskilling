package com.hcl.stream;

import java.util.Arrays;
import java.util.List;

public class EvenDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,13,16,19,20,22,24,25);
	    list.stream() .filter(num -> num % 2 == 0).forEach(System.out::println);

	}

}
