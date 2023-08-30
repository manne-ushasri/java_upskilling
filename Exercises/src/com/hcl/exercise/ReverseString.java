package com.hcl.exercise;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string ");
		str = sc.nextLine();
		System.out.print("The reversed string is :  ");
		int i = str.length();
		while (i > 0) {
			System.out.print(str.charAt(i - 1));
			i--;
		}
	}

}
