package com.akshu.javaLogical;

import java.util.Scanner;

public class Program21
{
	public static void displayMissing(int[] arr)
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
		
		for(int i = 0 ; i < arr.length-1; i++)
		{
			int diff = arr[i+1] - arr[i];
			// temp = 0 ;
			while(diff != 1)
			{
				System.out.print(++(arr[i])+"  ");
				diff--;
				//temp++;
				//if(temp % 10 ==0) System.out.println();
			}
		}	
	}
		
	public static void main(String[] args) 
	{
	       Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the size of the array: ");
	        
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) 
	        {
	            arr[i] = scanner.nextInt();
	        }
	        
	        scanner.close();
	        
	        Program21.displayMissing(arr);  
	}
}
