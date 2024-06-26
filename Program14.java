package com.akshu.javaLogical;

import java.util.Scanner;

public class Program14 
{
	public static void searchStudent(String[] arr , String name)
	{
		int count=0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i].equalsIgnoreCase(name))
			{
				count++;
				System.out.println(name+" Found at "+(i+1));			
			}
		}
		if(count == 0)
		{
			System.out.println(name+" Not Found ");
			
		}
	}
	

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you wants to store in array: ");
		int size = sc.nextInt();
		
		String nume[] = new String[size];
		
		System.out.println("Enter "+size+" integers : ");
		for(int i = 0 ; i < size ; i++)
		{
			nume[i] = sc.next();
		}
		
		System.out.println("Enter name to search");
		String name = sc.next();
		sc.close();
		
		Program14.searchStudent(nume, name);
	}

}
