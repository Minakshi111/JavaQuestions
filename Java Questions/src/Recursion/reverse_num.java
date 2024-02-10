package Recursion;

public class reverse_num {
	static int sum= 0;
	static String digit[]= {"Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	
	public static void main( String [] str)
	{
		
		int num= 123;
		
		int rev= convert(num);
		System.out.println(rev);
		
		
	}

	private static int convert(int x) 
	{

		int sum=0;
		
		if(x>Integer.MAX_VALUE)
		{
			return 0;
		}

        while(x!=0)
        {
            int mod= x%10;
            sum= sum*10+mod;
            x= x/10;
        }
		return sum;

}
}
