
package com.akshu.javaLogical;

import java.util.Scanner;

public class Program3 
{
	
	public static void searchElement(int arr[] , int ...val)
	{
		System.out.println("\nValues that are available in array are: ");
		
		for(int x : val)
		{
			boolean flag = false;
			int index = 0 ;
			for(int i = 0 ; i < arr.length ;i++)
			{
				if(arr[i] == x)
				{
					index = i;
					flag = true ;
					System.out.println(x+" is Found at "+index);
				}
			}
			
			if(flag == false)
			{
				System.out.println(x+" Element not Found !!!!");
			}
			
		}
		
	  }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int sub[] = new int[10];
		
		System.out.println("Enter 10 integers : ");
		for(int i = 0 ; i< sub.length ; i++)
		{
			sub[i] = sc.nextInt();
		}
		
		Program3.searchElement(sub, 10 , 55 , 30);
		
	}

}