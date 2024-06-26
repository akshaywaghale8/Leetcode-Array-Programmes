package com.akshu.LogicalAssignments;

import java.util.Scanner;

class Display
{
	private int a , b ,c ;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.print("Enter 1st Value : ");
		a = sc.nextInt();
		System.out.print("Enter 2nd Value : ");
		b = sc.nextInt();	
	}
	
	public void  max()
	{
		 c = a > b ?  a : b ; 
		System.out.println("Maximum number is : "+c);
	}
	
	public void min()
	{
		 c = a < b ?  a : b ; 
		 System.out.println("Minimum number is : "+c);
	}
	
	public void difference()
	{
		if (a > b)
		{
			System.out.println("Difference is : "+(a-b));
		}
		else
		{
			System.out.println("Difference is : "+(b-a));
		}
	}
}

public class DisplayMaxMin 
{
	public static void main(String[] args) 
	{
		Display d = new Display();
		d.accept();
		d.max();
		d.min();
		d.difference();
	}

}
