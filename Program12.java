package com.akshu.javaLogical;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
		
		System.out.println("How many ROW ELEMTS you wants in array: ");
		int row = sc.nextInt();
		
		System.out.println("How many COLUMN ELEMTS you wants in array: ");
		int col = sc.nextInt();
		
		int[][] num = new int[row][col];
		
		System.out.println("Enter "+(row*col)+" elements :");
	
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < col ; j++)
			{
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Stored values are :");
		for(int[] ele : num)
		{
			for(int x : ele) 
			{
				System.out.print(x+"  ");
			}
			System.out.println();
		}
	}

}
