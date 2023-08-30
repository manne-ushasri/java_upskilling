package com.hcl.exercise;

import java.time.YearMonth;
import java.util.Scanner;

public class EnumExample {
	
		public enum Month{January,Feburary,March,April,May,June,July,August,September,October,November,December}


	    public static void main(String[] args) {
	        for (Month mon : Month.values()) {
	            System.out.println(mon);
	        }

	        int year = 2023;

	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.println("Enter a month : ");
	            int month = sc.nextInt();

	            YearMonth yearMonth = YearMonth.of(year, month);
	            int daysInMonth = yearMonth.lengthOfMonth();

	            System.out.println("The number of days in " + yearMonth.getMonth() + ":" +daysInMonth);
	        }
	    }
		

	}


