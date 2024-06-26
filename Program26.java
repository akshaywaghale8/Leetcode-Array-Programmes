package com.akshu.javaLogical;

import java.util.Scanner;

public class Program26 
{

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
        
        System.out.println("Enter number to search : ");
        int target = scanner.nextInt();
        int  count = 0;
        for(int ele : arr)
        {
        	if(ele == target)
        	{
        		count++;
        	}
        }
        
        System.out.println(target +" Found : "+count+" Times");
        }

}
