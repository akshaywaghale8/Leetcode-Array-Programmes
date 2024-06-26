package com.akshu.javaLogical;
/*WAP A PROGRAM TO STORE 10 NUMBERS IN ARRAY AND PERFORM FOLLOWING TASK
1)DiSPLAY ALL ELEMENTS 
2)DISPLAY ALL GIVEN VALUE 
3)DISPLAY ALL VALUE THAT ARE ODD
4)DISPLAY ALL VALUE DIVISIBLE BY 2 AND 3
5)DISPLAY ALL VALUE DIVISIBLE BY 5
*/
public class Program2 
{
	public static void displayElements(int arr[])
	{
		for(int  r = 0;r < 2; r++)
		{
			if(r==0) 
			{
				System.out.println("\n Elements Stored in array :");
			}
			else
			{
				System.out.println("\nOOD Elements Stored in array :");
				
			}
			for(int i = 0; i < arr.length ; i++)
			{
				if(r == 0) 
				{
					System.out.print(arr[i]+" ");
				}
				if(r == 1)
				{
					if(arr[i] % 2 != 0) 
					{
						System.out.print(arr[i]+" ");
					}
					
				}
			}
		}
		
	}
	
	public static void evenElements(int arr[])
	{
		System.out.println("\nEVEN elements are") ;
		for(int i = 0; i < arr.length ; i++)
		{
			if(arr[i] % 2==0) 
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void searchElement(int arr[] , int ...val)
	{
		System.out.println("\nValues that are available in array are: ");
		
		for(int x : val)
		{
			for(int i = 0 ; i < arr.length ;i++)
			{
				if(arr[i] == x)
				{
					System.out.print("\nelement "+arr[i]+" is present at "+i+" location");
				}
			}
		}
	}
	
	public static void displayDivByTwoAndThree(int arr[])
	{
		System.out.println("\nElements divisible by 2 and 3 are: ");
		for(int i = 0; i < arr.length ; i++)
		{
			if((arr[i]% 2 == 0 )&& (arr[i]% 3 == 0))
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void displayDivBy5(int arr[])
	{
		System.out.println("\nElements divisible by 2 and 3 are: ");
		for(int i = 0; i < arr.length ; i++)
		{
			if(arr[i] % 5 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = {10,11,12,15,75,84,60,35,55,40};
		
		Program2.displayElements(arr);
		
		Program2.evenElements(arr);
	
		Program2.displayDivByTwoAndThree(arr);
		
		Program2.searchElement(arr,10,20,55,60);
		
		Program2.displayDivBy5(arr);
	}

}
