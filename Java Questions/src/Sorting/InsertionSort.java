package Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String [] str)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();		
		int arr[]= new int[n];
		
		for( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
				
		// Implement Insertion sort here		
		// Insertion Sort > We do not swap the elements but we shift the elements to right or left
		
		for ( int i=1; i<n;i++)
		{		
			int temp= arr[i];
			System.out.println("i is :"+i);
			
			boolean f= false;
			int j=i-1;
			
			for ( ; j>=0; j--)
			{
				
				if(temp < arr[j])
				{
					// shift
					f= true;
					arr[j+1]= arr[j];					
				}				
				else
					break;
			}			
			System.out.println("j is: "+(j));
			arr[j+1]= temp;			
		}
		
		// Print the sorted array
		
		for( int i=0; i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
