package com.app;

public class Program4 {
	
	static String extractInt(String str) 
    { 

		str = str.replaceAll("[^\\d]", ""); 
  
        str = str.trim(); 
  
        str = str.replaceAll(" +", ""); 
  
        if (str.equals("")) 
            return "-1"; 
  
        return str; 
    } 
  
    public static void main(String[] args) 
    { 
        String str = "(781) 456-1289"; 
        System.out.print(extractInt(str)); 
    } 
}	
	
	