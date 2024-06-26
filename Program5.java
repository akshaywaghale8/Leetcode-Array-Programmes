package com.akshu.javaLogical;

import java.util.Scanner;

public class Program5 
{
	
	public static void displayAssendingArray(int arr[])
	{
		int temp = 0 ;
		for(int i = 0 ; i < arr.length  ; i++)
		{
			for(int j = i+1; j < arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		System.out.println("Array elements in Assending order are:");
		Program4.displayArrayElements(arr);
	}
	
	public static void displayDesendingArray(int arr[])
	{
		int temp = 0 ;
		for(int i = 0 ; i < arr.length - 1 ; i++)
		{
			for(int j = i+1; j < arr.length;j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		System.out.println(" \n Array elements in Desending order are:");
		Program4.displayArrayElements(arr);
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
		
		Program5.displayAssendingArray(arr);

		Program5.displayDesendingArray(arr);
	}

}
