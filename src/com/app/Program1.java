package com.app;

public class Program1 {

	public static void main(String[] args) {
          String input= "Rajesh Kumar";
          
          System.out.println("Original String :: "+ input);
          
          String reverse = "";
          for(int i = input.length() -1; i >= 0; i--) {
        	  reverse = reverse + input.charAt(i);
          }
          System.out.println("Reversed String :: " + reverse);
	}

}
