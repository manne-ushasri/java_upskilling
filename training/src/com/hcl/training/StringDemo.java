package com.hcl.training;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		for(int i=str.length();i>0;--i){
		System.out.println(str.charAt(i-1));
		}
	}

}
