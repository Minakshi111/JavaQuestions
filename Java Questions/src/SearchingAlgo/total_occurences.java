package SearchingAlgo;

import java.util.Scanner;

public class total_occurences {
	static int first=0;
	static int last=0;
	
	public static void main(String [] str)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for (int i=0; i<n; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int num= sc.nextInt();
       int mid= (0+arr.length)/2;
		// find the num's first and last occurence in this array
		// input : 
		/* 8
		 * 0 0 1 1 2 2 2 2
		 * 2
		 * output= 4 7
		 */
		
		
		// Implement the binary search algo here
       firstOccurence(arr, n, num,0,arr.length-1, mid);	
     lastOccurence(arr, n, num,0,arr.length-1, mid);	
     System.out.println("Last is: "+last);
     System.out.println("First is: "+first);
     
     int result= (last-first)+1;
       System.out.println("total occurence is : "+result);
		 
		
	}
	
private static void lastOccurence(int[] arr, int n, int num, int start, int end, int mid) {
		
		while(start<=end)
		{
		//	int mid= start+(end-start)/2;
			 mid=(start+end)/2;
			
			if(arr[mid]==num)
			{				
				last=mid;	
				
				start=mid+1;		
			}
			else if(arr[mid]>num)
			{
				end= mid-1;
			}
			else if(arr[mid]<num)
			{
				start=mid+1;
			}
			
		}
	}


private static void firstOccurence(int[] arr, int n, int num, int start, int end, int mid) {
	
	while(start<=end)
	{
	//	int mid= start+(end-start)/2;
		 mid=(start+end)/2;
		
		if(arr[mid]==num)
		{				
		first= mid;
		
			end=mid-1;		
		}
		else if(arr[mid]>num)
		{
			end= mid-1;
		}
		else if(arr[mid]<num)
		{
			start=mid+1;
		}
		
	}
}

}
