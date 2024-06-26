package com.akshu.javaLogical;

import java.util.Scanner;

public class Program13 
{
	public static void show(int[][] arr)
	{
		for(int[] ele : arr)
		{
			for(int x : ele) 
			{
				System.out.print(x+"   ");
			}
			System.out.println();
		}
		
	}
	public static void arraySum(int[][] arr1, int[][] arr2, int row, int col )
	{
			int sumArr[][] = new int[row][col] ;
			
			for(int i = 0 ; i < row ; i++)
			{
				for(int j = 0 ; j < col ; j++)
				{
					sumArr[i][j] =  arr2[i][j] + arr2[i][j] ;
				}
			}
			
			System.out.println("New Array After Addition :");
			
			Program13.show(sumArr);
		
	}
	

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("How many ROW ELEMTS you wants in array: ");
		int row = sc.nextInt();
		
		System.out.println("How many COLUMN ELEMTS you wants in array: ");
		int col = sc.nextInt();
		
		
		int[][] num1 = new int[row][col];
		int[][] num2 = new int[row][col];
		
		
		for(int r = 1; r < 3; r++)
		{
			 System.out.println("Enter "+(row*col)+" elements of "+(r+1)+" Array:");

			for(int i = 0 ; i < row ; i++)
			{
				for(int j = 0 ; j < col ; j++)
				{
					if(r==1) 
					{
						num1[i][j] = sc.nextInt();
					}
					else
					{
						num2[i][j] = sc.nextInt();
					}
				}
			}
		}
		
	    sc.close();
	    
	    System.out.println("Stored values in Frist array :");
	    Program13.show(num1);
		
		System.out.println("Stored values in Second array :");
		Program13.show(num2);
		
		Program13.arraySum(num1, num2 , row , col);
		
	}

}
