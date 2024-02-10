package Sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String [] str)
	{
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		
		boolean sorted= false;
		
		for ( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		// Implement bubble sort here
		
		for ( int i=0; i<(n-1);i++)
		{
			
			for ( int j=0; j< ((n-1)-i); j++)
			{				
				if(arr[j]>arr[j+1])
				{
					// swap
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					sorted= true;
				}
				
			}
			
			if(sorted== false)
			{
				System.out.println("Already sorted");
				break;
			}
		}
		
		
		for ( int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
