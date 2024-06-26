package com.akshu.javaLogical;

import java.util.Scanner;

public class Program23 
{
	public static void diplayDiagonalSum(int[][] arr)
	{
		int rSum = 0 , lSum = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++)
			{
				if(i==j)
				{
					lSum += arr[i][j];
				}
				if(i+j == arr.length-1)
				{
					rSum += arr[i][j];
				}	
			}
		}
		System.out.println("Left Diagonal Elements Sum is : "+lSum);
		System.out.println("Right Diagonal Elements Sum is : "+rSum);
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Number of rows in array: ");
		int row = sc.nextInt();
		
		System.out.println("enter Number of columns in array: ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		System.out.println("Enter "+(row*col)+" elements of array : ");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < col ;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		Program23.diplayDiagonalSum(arr);
	}

}
