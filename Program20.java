package com.akshu.javaLogical;

import java.util.Scanner;

public class Program20 
{
	
	public static boolean checkEquality(int[][] arr1, int[][] arr2)
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
				for(int j = 0; j < arr1.length ;j++)
				{
					if(arr1[i][j] == arr2[i][j])
					{
						count = 1 ;
					}
					else
					{
						return false;
					}
				}
			}
			
			 return true;
		}
	}

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Row Number of rows Frist array: ");
		int row = sc.nextInt();
		
		System.out.println("enter col Number of rows Frist array: ");
		int col = sc.nextInt();
		
		int[][] arr1 = new int[row][col];
		
		System.out.println("Enter "+(row*col)+" integers : ");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < col ;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("enter Row Number of rows Second array: ");
		int row1 = sc.nextInt();
		
		System.out.println("enter col Number of rows Frist array: ");
		int col1 = sc.nextInt();
		
		int[][] arr2 = new int[row1][col1];
		
		System.out.println("Enter "+(row1*col1)+" integers : ");
		for(int i = 0 ; i < row1 ; i++)
		{
			for(int j = 0 ; j < col1 ;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Is two Array are Equal :- "+Program20.checkEquality(arr1,arr2));
		
		
	}

}
