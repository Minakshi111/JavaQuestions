package SearchingAlgo;

import java.util.Scanner;

public class Binary_search_recursion {
	static  int  num;
	static boolean flag= false;
	public static void main(String [] str)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();		
		int arr[]= new int[n];
		for( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}		
	   num= sc.nextInt();
	   
	   int start=0;
		int end= arr.length-1;	
		
		
		// Implement Binary search algorithm here		
		  binarySearch(arr, start, end);
		
		
	}

	private static int binarySearch(int[] arr, int start, int end) {
			
		int mid= (start+end)/2;
	
		if(arr[mid]==num)
		{
			System.out.println("Found");
			return mid;
		}
		if(start==end)
		{
			System.out.println("Not found");
			return -1;
		}
		else if(arr[mid]>num)    // left side
		{
			System.out.println("Left array: start=0, end= "+(mid-1));
			binarySearch(arr, 0, mid-1);
			
		}
		else if (arr[mid] < num)     // Right side
		{
			System.out.println("Right array: start= "+(mid+1)+" , end= " + (arr.length-1));
			binarySearch(arr, mid+1, arr.length-1);
		}	
		
		return -1;		
	}
}
