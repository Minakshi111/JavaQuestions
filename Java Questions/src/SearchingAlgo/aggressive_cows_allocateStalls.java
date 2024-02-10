package SearchingAlgo;

import java.util.Scanner;

public class aggressive_cows_allocateStalls {

	public static void main(String [] str)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int cows= sc.nextInt();
		
		int stalls[]= new int[n];
		
		for ( int i=0; i<n;i++)
		{
			stalls[i]= sc.nextInt();
		}
		
		int s=0;
		int maxi= -1;
		
		for( int i=0 ; i<n;i++)
		{
			
			maxi= max(maxi, stalls[i]);
		}
		
		int e= maxi;
		int mid= (s+e)/2;
		int ans= -1;
		
		while(s<=e)
		{
			if(isPossible(stalls,cows, mid))
			{
				ans= mid;
				s= mid+1;
			}
			else
			{
				e= mid-1;
			}
			
			mid= (s+e)/2;
		}
		
		System.out.println("Ans is: "+ans);
		
	}

	private static boolean isPossible(int[] stalls, int  cow, int mid) {
		// TODO Auto-generated method stub
		
		int cowCount= 1;
		int lastPos= stalls[0];
		
		
		for ( int i=0; i<stalls.length;i++)
		{						
			if(stalls[i]-lastPos >= mid)
			{
				cowCount++;
				if(cowCount==cow)
				{
					return true;
				}	
				lastPos= stalls[i];					
			}
		}
				
		return false;
	}

	private static int max(int maxi, int i) {
		// TODO Auto-generated method stub
		
		if(maxi>i)
			return maxi;
		else
			return i;

	}
}
