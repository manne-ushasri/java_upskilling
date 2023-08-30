package com.hcl.exercise;

import java.util.Scanner;

public class OddNumber {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
	
	try {
		if (num % 2 != 0) 
			throw (new OddNumberException());
		else
			System.out.println(num + " is an even number");
		}
	
		catch(OddNumberException e) {
		System.err.println("Given number is an odd number");
		}
		
		}

}
