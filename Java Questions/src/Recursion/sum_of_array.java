package Recursion;

public class sum_of_array {
	public static void main(String[] str)
	{
		int arr[]= {2,1,6,7};		
		int res= sum(arr, arr.length, (arr.length-1));
		System.out.println(res);		
	}
	
	private static int sum(int[] arr, int length, int i) {
		if(length==1)
		{
			int digit= arr[length-1];
			return digit;
		}		
		int sum = arr[i]+sum(arr, length-1, i-1);
		return sum;	
	}


}