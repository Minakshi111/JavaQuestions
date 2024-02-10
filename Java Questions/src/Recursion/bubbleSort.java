package Recursion;

public class bubbleSort {
	public static void main(String[] str)
	{
		
		int arr[]= {23,14,22,12,13};
		
		int arr1[]= bubble(arr, arr.length , 0, 0);
		for ( int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

	private static int[] bubble(int[] arr, int length, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i==length-1)
		{
			return arr;
		}
		if(j==((length-1)-i))
		{
			i=i+1;
			j=0;
		}
		
		// swap
		if(arr[j]>arr[j+1])
		{
			int temp= arr[j];
			arr[j]= arr[j+1];
			arr[j+1]= temp;
		}
		
		arr= bubble(arr, arr.length, i, j+1);
		return arr;
	}
	

}
