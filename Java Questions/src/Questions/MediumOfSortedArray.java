package Questions;

public class MediumOfSortedArray {
	
	public static void main(String[] str)
	{
		int nums1[]= {1,3};
		int nums2[]= {4};
		
		double res= function(nums1,nums2);
		System.out.println(res);
		
	}
	
	

	public static double function(int[] nums1, int[] nums2) {
	
		int i= 0;
		int j=0;
		int index=0;
		int [] res= new int[nums1.length+nums2.length];
		
		while(i<nums1.length && j< nums2.length)
		{
			if(nums1[i]<nums2[j])
			{
				res[index++]= nums1[i++];
			}
			else
			{
				res[index++]= nums2[j++];
			}
		}
		
		while(i< nums1.length)
		{
				res[index++]= nums1[i++];
		}
		
		while(j< nums2.length)
		{
			res[index++]= nums2[j++];
		}
		
		
		int len= res.length;
		double pos;
		double div= 2.0;
		
		
		if(len%2==0)
		{
	
			int mid= len/2;
			int a= res[mid];
			int b= res[mid-1];
		
			
			 pos= (res[mid]+res[mid-1])/div;

		}
		else
		{
		
			int a= res[len/2];
			 pos= a;
		}
		return pos;
	}
	

}
