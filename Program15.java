package com.akshu.javaLogical;

import java.util.Scanner;

public class Program15
{
	public static void searchStudent(int[] arr )
	{
		int count=0;
		int[] arr2 = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++)
		{	
			count=1;
			for(int j = 0 ; j < arr.length ; j++)
			{
				if(arr[i] == arr[j] &&  i != j)
				{
					count++;
					arr2[j] = 'A';
				}
			}
			arr2[i] = count;
		}
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr2[i] != 'A')
			{
				System.out.println(arr[i] +" is present "+arr2[i] +" Times");
			}
		}

	}
	
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
		sc.close();
		
		Program15.searchStudent(arr);
	}

}