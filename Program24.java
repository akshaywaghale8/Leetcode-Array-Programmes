package com.akshu.javaLogical;

import java.util.Scanner;

public class Program24 
{
	public static void shift(int[] arr , int index)
	{
		System.out.println("By method 1:");
		for(int i = index ; i < arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0 ; i < index ; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
	
	public static void shifArrayElement(int[] arr , int index)
	{
		for(int i = 0; i < index ; i++)
		{
			int temp = arr[0];
			
			for(int j=1 ; j < arr.length ;j++)
			{
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = temp;
			
		}
		System.out.println("By method 2:");
		Program4.displayArrayElements(arr);
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
        System.out.println("Enter Index : ");
        int index = scanner.nextInt();
        
        
        Program24.shift(arr, index);
        
        Program24.shifArrayElement(arr, index);
        
        scanner.close();

	}

}
