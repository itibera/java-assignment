/*
Given are two one-dimensional arrays A &amp; B, which are sorted in ascending order. Write a program to merge them
into single sorted array C that contains every item from arrays. A &amp; B, in ascending order.
*/

import java.util.*; 
import java.lang.*; 
import java.io.*; 

class SortedArray
{ 
	public static void mergeArrays(int[] A, int[] B, int n1, int n2, int[] C) 
	{ 
		int i = 0, j = 0, k = 0; 

		while (i<n1 && j <n2) 
		{ 
			if (A[i] < B[j]) 
				C[k++] = A[i++]; 
			else
				C[k++] = B[j++]; 
		} 
	
		while (i < n1) 
			C[k++] = A[i++]; 
	
		while (j < n2) 
			C[k++] = B[j++]; 
	} 
	
	public static void main (String[] args) 
	{ 
		int[] A = {1, 3, 5, 7}; 
		int n1 = A.length; 
	
		int[] B = {2, 4, 6, 8}; 
		int n2 = B.length; 
	
		int[] C = new int[n1+n2]; 
		
		mergeArrays(A, B, n1, n2, C); 
	
		System.out.println("Array after merging"); 
		for (int i=0; i < n1+n2; i++) 
			System.out.print(C[i] + " "); 
	} 
} 

