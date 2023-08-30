package com.hcl.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 5, 7, 10, 4, 15, 3, 6, 7, 10);
		System.out.println("Duplicate elements  are :" + findDuplicateElements(list));

	}

	private static Set<Integer> findDuplicateElements(List<Integer> list) {

		return list.stream().filter(myList -> Collections.frequency(list, myList) > 1).collect(Collectors.toSet());
	}

}
