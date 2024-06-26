package com.akshu.javaLogical;

import java.util.Scanner;

public class Program16 
{
	
	public static boolean checkEquality(int[] arr1, int[] arr2)
	{
		int count = 0;
		
		if(arr1.length != arr2.length)
		{
			return false;
		}
		else
		{
			for(int i=0 ; i < arr1.length ; i++)
			{
				if(arr1[i] == arr2[i])
				{
					count = 1 ;
				}
				else
				{
					return false;
				}
			}
			
			 return true;
		}
	}

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you wants to store in Frist array: ");
		int size1 = sc.nextInt();
		
		int arr1[] = new int[size1];
		
		System.out.println("Enter "+size1+" integers : ");
		for(int i = 0 ; i < size1 ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("How many elements you wants to store in Second array: ");
		int size2 = sc.nextInt();
		
        int arr2[] = new int[size2];
		
		System.out.println("Enter "+size2+" integers : ");
		for(int i = 0 ; i < size2 ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Is two Array are Equal :- "+Program16.checkEquality(arr1,arr2));
		
		
	}

}
