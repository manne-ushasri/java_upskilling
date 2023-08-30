package com.hcl.stream;

import java.util.Arrays;
import java.util.List;

public class NumberOfElementsDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		int count = (int) list.stream().count();
		System.out.println(count);

	}

}
