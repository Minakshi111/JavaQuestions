package Sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String [] str)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int arr[]= new int[n];
		
		for ( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		
		// Implement the quick sort here
		
		quickSort(arr, 0, n-1);
		
		for ( int i=0; i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

	private static void quickSort(int[] arr, int s, int e) {
		
		// Base Condition
		if(s>=e)
			return;
		
		// Partition on basis of first element
		
		int p= partition(arr,s,e);
		
		// Call recursion for further 2 parts of array
		
		quickSort(arr,s, p-1);
		quickSort(arr,p+1,e);
		
	}

	private static int partition(int[] arr, int s, int e) {
		// TODO Auto-generated method stub
		int p=0;
		int count=0;
		int ele= arr[s];
		
		for ( int i=(s+1); i<=e;i++)
		{
			if(ele>=arr[i])
				count=count+1;			
		}
		
		int index= s+count;
		
		// swap these 2 elements
		int temp= arr[index];
		arr[index]=arr[s];
		arr[s]= temp;
		
		
		// Now full fill the condition that all left are smaller and all right are bigger
		int i=s;
		int j= (e);
		
		while(i< index && j> index)
		{
			
			 while (arr[i]< arr[index])
			 {
				 i++;
			 }
			 while(arr[j]> arr[index])
			 {
				 j--;
			 }
			 
			if(i< index && j> index)
			{
				// swap the elements
				int temp1= arr[i];
				arr[i++]= arr[j];
				arr[j--]= temp1;					
			}			
		}
		
		return index;
	}
}
