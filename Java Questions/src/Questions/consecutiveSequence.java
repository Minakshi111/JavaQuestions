package Questions;

public class consecutiveSequence {
	public static void main(String[] str)
	{
		int arr[] = {1,5,3,6,2,4};
		
		// array is sorted now
		
		int arr1[]= bubbleSort(arr);
		
		// Search for consecutive sequence
		int longest= 0;
		int current= 1;
		boolean f= false;
		for ( int i=1; i<arr1.length;i++)
		{	
				if(arr1[i] != arr1[i-1])
				{
					if(arr1[i]== (arr1[i-1]+1))
					{
						current= current+1;
					}
					else
					{
						if(current >longest)
							longest= current;
						current=1;		
						f= true;
				}
			}
		}
		if(f==false)
			longest= current;
		
		System.out.println("ans is : "+longest);
		
		
		
	}

	private static int[] bubbleSort(int[] arr) {
	//	boolean flag= true;
		int n= arr.length;
		for ( int i=0; i<n-2; i++)
		{			
			for ( int j=0; j<((n-1)-i); j++)
			{
				if(arr[j]>arr[j+1])
				{
					
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				//	flag= false;
				}					
			}						
			// thats means array is sorted
		
		}
		return arr;
	}

}
