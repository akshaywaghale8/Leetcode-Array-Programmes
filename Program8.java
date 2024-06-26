package com.akshu.javaLogical;



public class Program8 {

	public static void main(String[] args)
	{
		
		int arr[] = new int[20];
		
		int t1=0 , t2 = 1 , t3;
		
		arr[0]= t1 ;
		arr[1] = t2 ;
		for(int i = 2 ; i < 20 ; i++)
		{
			t3 = t1 + t2;
			arr[i] = t3 ;
			t1 = t2;
			t2 = t3 ;
		}
		System.out.println("Array Elements are : ");
		Program4.displayArrayElements(arr);
		

	}

}
