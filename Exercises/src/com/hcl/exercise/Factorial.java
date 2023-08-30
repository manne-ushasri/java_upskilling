package com.hcl.exercise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i = 1;

		System.out.println("Enter a number to find its factorial : ");
		int num = sc.nextInt();
		while (i <= num) {
			System.out.println(fact +" " +i);
			fact = fact * i;
			i=i++;
		}
		System.out.println(" Factorial of given number " + num + " is : " + fact);
		

	}

}




//Scanner sc = new Scanner(System.in);
//float fact = 0.1f;
//float i = 0.1f;
//
//System.out.println("Enter a number to find its factorial : ");
//float num = sc.nextFloat();
//while (i <= num) {
//	System.out.println(fact +" " +i);
//	fact = fact * i;
//	
//	i=i+0.1f;
//}
//System.out.println(" Factorial of given number " + num + " is : " + fact);

