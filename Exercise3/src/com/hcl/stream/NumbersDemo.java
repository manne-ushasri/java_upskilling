package com.hcl.stream;

import java.util.Arrays;
import java.util.List;

public class NumbersDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,13,20,30,15,21,16,19);
		list.stream().map(str -> str + "") 
				.filter(str -> str.startsWith("1")).forEach(System.out::println);
	}

}
