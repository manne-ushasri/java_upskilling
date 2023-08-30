package com.hcl.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 9, 10, 17, 20, 9, 2, 10));
		System.out.println("The elements in the list are : " + list);

		Stream<Integer> stream = list.stream();

		stream = stream.distinct();

		list = (ArrayList<Integer>) stream.collect(Collectors.toList());
		System.out.println("List after removing all duplicate elements : " + list);

	}

}
 