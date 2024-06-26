package com.akshu.javaLogical;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you wants to store in array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" integers : ");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements Factors of 100 are :");
		for(int ele : arr)
		{
			if(100 % ele == 0)
			{
				System.out.print(ele+" ");
			}
		}

	}

}
