package Recursion;

public class climb_stairs {
	static int count=0;
	public static void main(String[] str)
	{
		
		int stair= 3;
		
		int res= climb(stair);
		 System.out.println(res);
	}

	private static int climb(int n) {
		if(n==0)
			return 1;
		
		if(n<0)
			return 0;
		
		int sum1= climb(n-1);
		int sum2= climb(n-2);
		int sum= sum1+sum2;
		return sum;
		
	}
	

}
