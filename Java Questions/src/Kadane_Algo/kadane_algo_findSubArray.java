package Kadane_Algo;

import java.util.Scanner;

public class kadane_algo_findSubArray {

	public static void main(String [] str)
	{
		int arr[]= new int [10];
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();		
		for ( int i=0; i<n;i++)
			arr[i]= sc.nextInt();	
		
		// Input= { -2,1,-3,4,-1,2,1,-5,4 }
		
		// Find the subarray having maximum of sum		
		int sum=0;
		int maxi= arr[0];		
		for ( int i=0; i<n;i++)
		{
			sum=sum+arr[i];
			maxi= findMax(sum, maxi);
			if(sum<0)
				sum=0;
		}
		
		System.out.println("Maximum sum is: "+maxi);
	}

	public static int findMax(int a, int b)
	{
		if(a>b)
		return a;
		else
			return b;
	}
}
