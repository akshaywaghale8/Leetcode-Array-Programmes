
package com.akshu.javaLogical;
import java.util.*;

public class Program17
{
    
     public static void findSubarray(int[] arr, int targetSum) 
    {

        int start = 0, end = 0;
        int currentSum = arr[0];
        
        while (end < arr.length) 
        {
            if (currentSum == targetSum) 
            {
                System.out.println("Subarray found from index " + start + " to " + end);
                for(;start <= end ;start++)
                {
                	System.out.print(arr[start]+" ");
                }
                System.out.println();
                start = end ;
                currentSum = arr[end]; 
            }
            else if (currentSum < targetSum) 
            {
                end++; //2 3 4
                if (end < arr.length)
                {
                	currentSum += arr[end]; //27 20 26
                }
            } 
            else 
            {
                currentSum -= arr[start]; //0  12  
                start++; // 1 2 
            }
        }
        
        System.out.println("No subarray found with the given sum.");
    }
     
    /*
     public static void findSubArray(int arr[], int target)
     {
    	 
    	 boolean flag = false;
    	 for(int i = 0 ; i < arr.length ; i++)
    	 {
    		
    		 int sum = arr[i];
    		  int start = i;
    		 while(i < arr.length && sum != target)
    		 {
    			 if(sum == target)
    			 { 
    				flag = true;
    				for(; start <= i ; start++)
    				{
    					System.out.print(arr[start]+" ");
    				}
    		     }
    			 else
    			 {
    				sum += arr[i];
    				i++;
    			 }
    		 }
    	 }
    	 if(flag == false)
 		{
 			System.out.println("Sorry sub Array not Fount Whose Sum is "+target);
 		}
     }
     */
    
    public static void main(String[] args) {
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
        
        Program17.findSubarray(arr, targetSum);
        
        //Program17.findSubArray(arr, targetSum);
        
    }
}
