package com.akshu.javaLogical;

import java.util.Scanner;

public class Program4 
{

		public static void displayArrayElements(int arr[])
		{
			
			for(int ele : arr)
			{
				System.out.print(ele+" ");
			}
		}
		
		public static void displayReverseArrayElements(int arr[])
		{
			int brr[] = new int[arr.length];
			
			
			for(int  i = 0 , j = arr.length -1 ; i < arr.length  ; i++ ,j--)
			{
				brr[j] = arr[i];
			}
			
			System.out.println("\nElements stored in reverse order are :");
			Program4.displayArrayElements(brr);
			
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
			sc.close();
			
			System.out.println("Elements stored into array are :");
			Program4.displayArrayElements(arr);
			
			Program4.displayReverseArrayElements(arr);
		     
		}
}
