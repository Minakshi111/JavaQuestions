package SearchingAlgo;

import java.util.Scanner;

public class find_pivotElement_RotatedArray {
	public static void main(String[] str)
	{
		
		// Input an array > Rotate it by how many digits > Find the pivot element of this array > Find minimum element
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int rotated_arr[]= new int[n]; 
		
		for ( int i=0; i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int rotate_by= sc.nextInt();
		
		// rotate the array
		
		int i=0;
		int index=(n-rotate_by);
		
		while(index<=(n+rotate_by))
		{
			if(index>=n)
			{
				rotated_arr[i]= arr[index-n];
			}
			else
			{
				rotated_arr[i]= arr[index];
				
			}
			i=i+1;
			index= i+(n-rotate_by);
		}	
		
		// Find the Pivot element of rotated array
		
		
		int  s=0;
		int e= n-1;
		
		while(s<e)
		{
			int mid= (s+e)/2;
			
			if(rotated_arr[mid]>=rotated_arr[0])
					{
				s= mid+1;
				System.out.println("S is: "+s);
					}
			else
			{
				e=mid;
				System.out.println("E is: "+e);
			}
		}		
		System.out.println("Pivot element is: "+rotated_arr[s]);
	}
}