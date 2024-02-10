package Questions;

public class sumOf2Array {

	public static void main(String [] str)
	{
		int arr1[]= {9,2,3,4};
		int arr2[]= {4,5,9,9};
		
		int i= arr1.length-1;
		int j= arr1.length-1;
		int carry=0;
		int sum=0;
		int digit=0;
		System.out.println("Hello");
		
		String num= "";
		
		
		while (i>=0 && j>=0)   // when both array are equal
		{
			 sum= arr1[i]+arr2[j]+carry;
			 carry= sum /10;
			 digit= sum % 10;
			
			 num= num+Integer.toString(digit);
			 i--;
			 j--;
		}
		
		while (i>=0)  // when arr1 is bigger
		{
			sum= arr1[i]+arr2[j]+carry;
			 carry= sum /10;
			 digit= sum % 10;
			
			 num= num+Integer.toString(digit);
			 i--;			
		}
		
		while (j>=0)  // when arr2 is bigger
		{
			sum= arr1[i]+arr2[j]+carry;
			 carry= sum /10;
			 digit= sum % 10;
			 num= num+Integer.toString(digit);		 
			 j--;			
		}
		
		while (carry !=0)  // when there is carry at last
		{
			digit= carry;
			 num= num+Integer.toString(digit);
			carry=0;
			
		}		
		System.out.println(num);
		int num1= Integer.parseInt(num);
		System.out.println(num1);
	}
	
	
}
