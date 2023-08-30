package com.hcl.exercise;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Grades");
		System.out.println("Grade-A : Excellent job");
		System.out.println("Grade-B : Good job");
		System.out.println("Grade-C : Average job");
		System.out.println("Grade-D : Needs improvent");
		System.out.println("Grade-F : Failed");
		System.out.println("Invalid Grade");
		System.out.println("Enter the key:");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("Grade-A : Excellent job");

			break;

		case 2:
			System.out.println("Grade-B : Good job");

			break;
		case 3:
			System.out.println("Grade-C : Average job");

			break;
		case 4:
			System.out.println("Grade-D : Needs improvent");

			break;
		case 5:
			System.out.println("Grade-F : Failed");

			break;

		default:
			System.out.println("Invalid Grade");

			break;
		}

		System.out.println("Enter your choice:");
		String choice = sc.next();

		if (choice.equals("A")) {
			System.out.println("Excellent job");
		}

		else if (choice.equals("B"))
			System.out.println("Good job");

		else if (choice.equals("C"))
			System.out.println("Average job");

		else if (choice.equals("D"))
			System.out.println("Needs Improvement");

		else if (choice.equals("F"))
			System.out.println("Failed");

		else
			System.out.println("Invalid Grade");

	}

}
