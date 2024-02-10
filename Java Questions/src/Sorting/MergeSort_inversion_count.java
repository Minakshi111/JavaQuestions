package Sorting;

import java.util.Scanner;

public class MergeSort_inversion_count {
	static int count=0;
public static void main(String[] str)
{
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	int arr[]= new int[n];
	
	for ( int i=0; i<n;i++)
	{
		arr[i]= sc.nextInt();
	}
	
	// Implment Merge sort algorithm
	
	 mergeSort(arr, 0 , n-1);
   System.out.println("Sorted array");
	for( int i=0; i<n;i++)
	{
		System.out.println(arr[i]);
	}
	
	System.out.println("count is : "+count);
	
}

private static void mergeSort(int[] arr, int s, int e) {
	
	
	int mid= (s+e)/2;
	if(s<e)
	{
	
	// left part ko sort kro pehle
mergeSort(arr, s, mid);
	
	// right part ko sort kro
mergeSort(arr, mid+1, e);
	
	// dono sorted array ko merge kr do
	
merge(arr, s, e);
	}
	
	
}

// Mering 2 sorted array

private static void merge(int[] arr, int s, int e) {
	
	System.out.println(" Array aaya : ");
	System.out.println("s : "+s);
	System.out.println("e : "+e);
	
	
	for ( int i=s; i<=e;i++)
	{
		System.out.println(arr[i]);
	}
	int counter=0;
	int mid= (s+e)/2;
	
	int len1= (mid-s)+1;
	int len2= (e-mid);
	
	int arr1[]= new int[len1];
	int arr2[]= new int[len2];
	
	int k=s;
	for( int i=0;i<len1;i++)
	{
		arr1[i]= arr[k++];
	}
	
	k= (mid+1);
	for ( int i=0; i<len2;i++)
	{
		arr2[i]= arr[k++];
	}
	
	// merge 2 sorted array
	
	int index1=0;
	int index2=0;
	int mainIndex=s;
	
	
	while(index1<len1 && index2<len2)
	{
		
		if(arr1[index1]< arr2[index2])
		{
			System.out.println("Left side wala array ");
			System.out.println(arr1[index1]);
			System.out.println(arr2[index2]);
			
			arr[mainIndex++]= arr1[index1++];
			
			
		}
		else
		{	
			System.out.println("Right side wala array ");
			System.out.println(arr1[index1]);
			System.out.println(arr2[index2]);
			
			arr[mainIndex++]= arr2[index2++];
			count= count+(len1-index1);
			System.out.println("Count is : "+len1+" , "+ index1 +"= "+count);
			
		}		
	}
	
	// if both array has different lengh then add one more condition to check on both arrays
	
	while(index1<len1)
	{
		arr[mainIndex++]= arr1[index1++];
		
	}
	while(index2<len2)
	{
		arr[mainIndex++]= arr2[index2++];
		
	}

}
}
