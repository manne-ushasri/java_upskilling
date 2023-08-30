package com.hcl.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallestAndLargestDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 10, 15, 250, 20, 25, 50, 100);

		System.out.println("The input list is : " + list);

		int secondSmallest = list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();

		System.out.println("\nSecond smallest element in the list is : " + secondSmallest);

		Integer secondLargest = list.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst().orElse(null);

		System.out.println("\nSecond largest element in the list is : " + secondLargest);

		int largest = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println("\nLargest element in the list is : " + largest);

	}

}
