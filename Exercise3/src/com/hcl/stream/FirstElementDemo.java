package com.hcl.stream;

import java.util.Arrays;
import java.util.List;

public class FirstElementDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,10,15,20,25,20);
		list.stream().findFirst().ifPresent(System.out::println);
	}

}
