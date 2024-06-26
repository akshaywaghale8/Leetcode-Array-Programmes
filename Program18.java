package com.akshu.javaLogical;

import java.util.Scanner;

public class Program18 
{
	public static void findTriplate(int arr[], int sum)
	{
	        for (int i = 0; i < arr.length- 2; i++)
	        {
	        	for (int j = i + 1; j < arr.length - 1; j++) 
	            {
	                for (int k = j + 1; k < arr.length; k++) 
	                {
	                    if (arr[i] + arr[j] + arr[k] == sum) {
	                        System.out.println("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
	                    }
	                }
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
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();
        scanner.close();
        
        Program18.findTriplate(arr ,targetSum);
		
	}

}
