package Recursion;

public class SumOfAdjacent_elements {
	
	public static void main(String [] str)
	{
		int arr[]= {12,4,7,8,1};		
		
		int res= findSum(arr, 0);
		System.out.println(res);
		
	}

	private static int findSum(int[] arr, int n) {
		// Base conditions
		
		if(n==arr.length)
			return 0;
		
		if(n==arr.length-1)
			return arr[n];
		
		int include= findSum(arr, n+2) + arr[n];
		int exclude= findSum(arr, n+1 ) + 0;
		
		
		return max(include, exclude);
	}

	private static int max(int include, int exclude) {
		// TODO Auto-generated method stub
		if(include >exclude)
		return include;
		else
			return exclude;
	}
}
