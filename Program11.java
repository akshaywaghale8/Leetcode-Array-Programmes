package com.akshu.javaLogical;

import java.util.Scanner;

public class Program11 
{
	public static void searchTargetSum(int arr[] , int target)
	{
		int count = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if((arr[i] + arr[j]) == target)
				{   count++;
					System.out.println("Elemnts Found \n at "+i+" "+j+" position \nand Values are "+arr[i] +" "+arr[j] );
				}
			}
		}
		if(count == 0)
		{
			System.out.println("Elements not Found!!!!");
		}
	}

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you wants to store in array: ");
		int size = sc.nextInt();
		
		int num[] = new int[size];
		
		System.out.println("Enter "+size+" integers : ");
		for(int i = 0 ; i < size ; i++)
		{
			num[i] = sc.nextInt();
		}
		
		System.out.print("Enter target value ");
		int target = sc.nextInt();
		sc.close();
		
		Program11.searchTargetSum(num, target);

	}

}
