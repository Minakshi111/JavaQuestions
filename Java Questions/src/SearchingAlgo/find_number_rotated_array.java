package SearchingAlgo;

import java.util.Scanner;

public class find_number_rotated_array {
	static int target;
	public static void main(String[] str)
	{
		
		// Input an array > Rotate it by how many digits > Find the pivot element of this array > Find minimum element
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
	
		
		for ( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}

		 target= sc.nextInt();
		

		// Find the Pivot element of rotated array
		
		
		int  s=0;
		int e= n-1;
		
		while(s<e)
		{
			int mid= (s+e)/2;
			
			if(arr[mid]>=arr[0])
					{
				s= mid+1;
				
					}
			else
			{
				e=mid;
				
			}
		}		
		System.out.println("Pivot element is: "+arr[s]);
		
		
		// Search number in rotated array
		
		if(arr[s] <= target && target <= arr[n-1])
		{
			binarySearch(arr, s,n-1);
		}
		else
		{
			binarySearch(arr, 0,s-1);
		}
		
		
	}

	private static int binarySearch(int[] arr, int start, int end) {
		
		while(start<=end)
		{
			int mid= (start+end)/2;
			if(arr[mid]==target)
			{
				System.out.println("Target found on index : "+mid);
				return mid;
			}
			else if(arr[mid]>target)
			{
				end= mid-1;
			}
			else
				start= mid+1;			
		}
		return -1;   // this is called the default return, if function has not returned from if block that means element is not present and it shuld return -1
		
	}
}