package com.akshu.javaLogical;

import java.util.Scanner;

public class Program22 
{
	public static void displayBoundary(int[][] arr)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++)
			{
				if(i==0 || j==0 || i == arr.length-1 || j== arr.length-1 )
				{
					System.out.print(arr[i][j]+"   ");
				}
				else
				{
					System.out.print("    ");
				}
			}
			System.out.println("\n");
		}
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
		
		Program22.displayBoundary(arr);
	}

}
