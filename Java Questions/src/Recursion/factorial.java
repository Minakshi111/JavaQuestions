package Recursion;

public class factorial {
	public static void main(String [] str)
	{
		int n= 4;
		
		int res= fact(n, 1);
		System.out.println("Fact is : "+res);
	}

	private static int fact(int n, int result) {
		// Base condition	
		
		if(n==0)
		{
			return 1;
		}	
		 result= n*fact((n-1), result);		
		 System.out.println(result);
	
		return result;
	}
}
