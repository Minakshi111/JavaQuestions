package SearchingAlgo;

import java.util.Scanner;

public class BinarySearch_whileLoop {

	public static void main(String [] str)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();		
		int arr[]= new int[n];
		for( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}		
	   int num= sc.nextInt();
	   
	   int start=0;
		int end= arr.length-1;	
		
		binarysearch(arr, start, end, num);
		
	}

	private static int binarysearch(int[] arr, int start, int end, int num) {
		
		while(start<=end)
		{
			int mid= (start+end)/2;
			
			if(arr[mid]==num)
			{
				System.out.println("Found in while loop");
				return mid;
			}
			else
			{
				if(arr[mid]> num)
					// left side
					end=mid-1;
				else
					// right side
					start=mid+1;

			}
			
		}
		return -1;
		
	}
	
}
