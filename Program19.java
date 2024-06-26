package com.akshu.javaLogical;

import java.util.Scanner;

public class Program19 {
	public static void SepreateZero(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Array elements in With seprate Zero are:");
		Program4.displayArrayElements(arr);
	}

	public static void SepreateZeroNoSort(int arr[]) {
		int[] brr = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}

		for (int i = 0, j = count - 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				brr[j] = arr[i];
				j++;
			}
		}
		System.out.println("\n Method 2");
		Program4.displayArrayElements(brr);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");

		int size = scanner.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();

		Program19.SepreateZero(arr);

		Program19.SepreateZeroNoSort(arr);
	}
}
