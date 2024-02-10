package Recursion;

public class ifArraySorted {
	public static void main(String[] str)
	{
		int arr[]= {2,1,6,7};
		
		boolean flag= isSorted(arr, arr.length, 0);
		
		if(flag)
			System.out.println("Sorted");
		else
			System.out.println("Un-Sorted");
	}

	private static boolean isSorted(int[] arr, int length, int i) {
		
		if(length==0 || length==1)
			return true;
		
		if(arr[i] > arr[i+1])
			return false;
		
		boolean flag= isSorted(arr, length-1, i+1);
		
		return flag;
	}

}