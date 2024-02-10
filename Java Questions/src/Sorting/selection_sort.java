package Sorting;

import java.util.Scanner;

public class selection_sort {
public static void main(String [] str)
{
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int arr[]= new int[n];
	
	for ( int i=0; i<n;i++)
	{
		arr[i]= sc.nextInt();
	}
	
	// Implement the algo
	
	for ( int i=0; i<(n-1); i++)
	{
		int min= arr[i];
		
		for ( int j=i+1; j<n;j++)
		{
			
			if(arr[i] >arr[j])
			{
				int temp= arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
	}
	
	for ( int i=0; i<n; i++)
	{
		System.out.println(arr[i]);
	}
}
	
}
