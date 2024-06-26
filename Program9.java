package com.akshu.javaLogical;

import java.util.Scanner;

public class Program9 {
	public static void revEleArray(int arr[]) {
		int revEle[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			int digit;
			int rev = 0;
			do {
				digit = ele % 10;
				rev = (rev * 10) + digit;
				ele /= 10;
			} while (ele != 0);
			revEle[i] = rev;
		}
		System.out.println("rev array elements :");
		for (int ele : revEle) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many elements you wants to store in array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter " + size + " integers : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		Program9.revEleArray(arr);

	}
}
