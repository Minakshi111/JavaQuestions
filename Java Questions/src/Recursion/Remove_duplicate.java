package Recursion;

public class Remove_duplicate {
	
	public static void main(String [] str)
	{
	
	int arr[]=  {1,1};	
	int new_arr_index=0;
	
	int arr1[]= new int[arr.length];

	
	for (  int i=0; i<arr.length-1; i++)
	{
		
		if(arr[i] != arr[i+1])
		{
			arr1[new_arr_index++]= arr[i];
		}
	
	}
	
	arr1[new_arr_index++]= arr[arr.length-1];

	
	// print new array
	for ( int i=0; i<arr.length; i++)
	{
		System.out.println(arr1[i]);
	}
	System.out.println("index is : "+new_arr_index);
	
	}

}
