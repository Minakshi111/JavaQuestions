package Recursion;

public class Fabonacci {
	static int i=0;
	public static void main(String[] str)
	{
		int n=5;		
		int ans= fabo(n);
	}

	private static int fabo( int n) {
		i=i+1;
		
		 System.out.println("n: "+ n);
		
		if(n==0)
		{
			System.out.println("return 0");
			return 0;
		}
		if(n==1)
		{
			System.out.println("return 1");
			return 1;
		}
		System.out.println("relation part 1 , n: "+n);
		int a1= fabo(n-1);
		System.out.println("relation part 2 , n:  "+n);
		int a2= fabo(n-2);
	
		int ans= a1+a2;
//	 int ans= fabo(n-1)+fabo(n-2);
	 System.out.println("ans: "+ ans);
 	return ans ;
	}	
}
