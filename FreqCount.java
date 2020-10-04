/*
    Write a program to accept a string from the user and find out the following statistics:
        (a) Count of uppercase character
        (b) Count of lowercase character
        (c) Search for a String
        (d) Count of spaces
*/

import java.io.*; 
import java.util.Scanner;

class FreqCount
{ 
	public static void main(String args[]) 
	{ 
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
		int upper = 0, lower = 0, key_str = 0, space = 0; 

		for(int i = 0; i < str.length(); i++) 
		{ 
			char ch = str.charAt(i); 
			if (ch >= 'A' && ch <= 'Z') 
				upper++; 
			else if (ch >= 'a' && ch <= 'z') 
				lower++; 
			else if (ch == 32) 
                space++; 
            else 
                continue;
		} 

		System.out.println("Lower case letters : " + lower); 
		System.out.println("Upper case letters : " + upper);
        System.out.println("Spaces : " + space); 
        System.out.print("Enter a String for searching in this String : ");
        String substr = scan.nextLine();

        System.out.println(str.contains(substr)? "String found at " + str.indexOf(substr)+1 : "String not found!"); 
	} 
} 
