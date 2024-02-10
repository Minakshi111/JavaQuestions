package SearchingAlgo;

import java.util.Scanner;

public class pages_allocation_binary_search {

	static int ans=Integer.MAX_VALUE;
	static int students_count= 0;
	
	
	public static void main(String [] str)
	{
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int arr[]= new int[n];
		int sum=0;
		
		for ( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
			sum=sum+arr[i];
		}
		
		int start=0;
		int end= sum;
		int mid= (start+end)/2;

		
		while(start< end)
		{		
			
			 
		isPossible_solution(arr, start, end, mid, m);
		 
			 
		// check if this mid is a possible solution or not
			
						
			if(students_count< m)
			{
				
					end=mid-1;
			}
			else
			{
				
				start= mid+1;
			}
			mid=(start+end)/2;				
		}
		
		System.out.println("Answer is: "+ans);
		
	}
	
	public static  void isPossible_solution(int arr[], int start, int end, int mid, int student)
	{
		int n= arr.length;
		int total=0;		
		students_count= 0;
		 int part1=0;
		
		for ( int i=0; i<n;i++)
		{
			
	
			total= total+arr[i];				
				 if(total>mid)
				 {
					
					 students_count= students_count+1;
					 part1= total-arr[i];	
					
					 total=arr[i];					 
				 }
				 else if( total==mid)
				 {
					 students_count= students_count+1;
					 if(ans>=total)
						 ans= total;					
					 total=0;
				 }	
				 
		}		
		
		if(students_count== (student-1))
		{
			System.out.println("Mid is : "+mid);
			System.out.println("Count is : "+students_count);
			 if(ans>part1 && part1 !=0)
				 ans= part1;	
				 
		}
		
		
		
	}
	
}
