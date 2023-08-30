package com.hcl.streams;

import java.util.Arrays;
import java.util.List;

public class AverageDemo {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(15,17,19,20,22,25,30);
		double average = getAverage(list);
        System.out.println(average);
		
		
	}
	private static double getAverage(List<Integer> list) {
        return list.stream().mapToInt(a -> a).average().orElse(0);
    }
 

}
