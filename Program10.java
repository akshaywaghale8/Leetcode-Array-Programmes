
/*
 * these program is Sorting array program in which array elements are sorted in ascending order 
 * here outer loop will execute array-size times
 * and for every outer value i the inner loop will execute array-size minus(-) i times
 * if condition will check very time when inner for loop is execution
 * check condition will check if current i index is greater than j index value 
 * if condition is true then swapping operation is performed and current value are interchanged
 * till inner and outer loop condition is false 
 *  */


package com.akshu.javaLogical;
import java.util.Scanner;

public class Program10 
{
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
		sc.close();
		
		
		for(int i = 0 ;i < num.length ; i++ )
		{
			for(int j = i + 1 ; j < num.length ; j++)
			{
				if(num[i]>num[j])
				{
					int temp = num[i];
					num[i] = num[j];
					num[j]= temp;
				}
			}
		}
		
		System.out.println("Sorted array Elements are : ");
		for(int ele : num)
		{
			System.out.print(ele+" ");
		}
		
	}
}
