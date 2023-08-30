package com.hcl.training;

import java.util.ArrayList;
import java.util.List;

public class ExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 34, 23, 25, 16 };
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println("Even numbers are:" + arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				System.out.println("Odd numbers are:" + arr[i]);
			}

		}

	}

}

