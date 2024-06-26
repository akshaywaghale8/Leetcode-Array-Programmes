package com.akshu.javaLogical;

import java.util.Scanner;

public class Program25 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        
        int size = sc.nextInt();
        String[] arr = new String[size];
        
        System.out.println("Enter the "+size+" Names of the array:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.next();
        }
        
        for(String ele : arr)
        {
        	System.out.println(ele);
        }
	}
}
