package com.app;

public class Program2 {
	
	static void printDistinct(int arr[], int n) 
    { 

		for (int i = 0; i < n; i++) 
        { 

            int j; 
            for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
      
            if (i == j) 
            System.out.print( arr[i] + " "); 
        } 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = {40, 30, 19, 30, 4, 16, 43, 4, 39, 16, 55, 86, 30}; 
        int n = arr.length; 
        printDistinct(arr, n); 
  
    } 
} 

	