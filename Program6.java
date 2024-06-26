package com.akshu.javaLogical;

import java.util.Scanner;

public class Program6 
{
	
	public static void getHighestLowestValue(int arr[])
	{
		int max = arr[0] ;
		int min = arr[0];
		for(int i = 0 ; i < arr.length  ; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(arr[i] > max)	
			{
				max = arr[i];
			}
		}
		System.out.println("Highest Value is "+max);
		System.out.println("Lowest Value is "+min);

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
		
		Program6.getHighestLowestValue(arr);

	}

}
