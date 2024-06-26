package com.akshu.javaLogical;

import java.util.stream.Stream;

public class EvenFreqCheck 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,1,2,4,2,4,2,4,0,1,0};
		System.out.println(evenFreqCheck(arr));
		Stream<int[]> s = Stream.of(arr);
	}
	
	
	public static int evenFreqCheck(int[] arr)
	{
		int count = 0;
		int even = 0;
		
		int b = 0;
		int  s =0;
		
		int[] ct = new int[arr.length];
		int j = 0;
		for(int n : arr)
		{
			if(n%2 == 0 && n != 0)
			{
				if(s >= n )
				{
					s =n;
				}
				if(b <= n )
				{
					b = n;
				}
				even++;
				int max = 0;
				for(int i = 0 ; i < arr.length ; i++)
				{
					if(n == arr[i])
					{
						max++;
					}
				}
				if(count <= max)
				{
					count = max;
				}
				ct[j++] = max;
			}
			else
			{
				ct[j++] = 0;
			}
			
			
		}
		 if(even == 0)
		 {
			 return -1;
		 }
		 else
		 {
			for(int i =0;i < arr.length; i++)
			{
					if(ct[i] == count)
					{
						even = arr[i];
						break;
					}
			}
			return  even;
		 }
	}

}
