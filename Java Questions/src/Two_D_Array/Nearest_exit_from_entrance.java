package Two_D_Array;

import java.util.Scanner;

public class Nearest_exit_from_entrance {
	public static void main(String[] str)
	{
		
	
	
	Scanner sc= new Scanner(System.in);
	
	int n= 3;
	int m= 3;
//	int m= sc.nextInt();
	
	
	char[][] arr= new char[n][m];
	int [][] visited= new int[n][m];
	
	// This is how to get row and col of an array
	
	int row= arr.length;
	int col= arr[0].length;
	
	
	
	
	for ( int i=0; i<n;i++)
	{
		
			String st= sc.nextLine();
			String[] ch= st.split(" ");
			
			for ( int k=0; k<ch.length;k++)
			{
				String s= ch[k];			
				arr[i][k]= s.charAt(0);
			}
			
	}
	
	
	int i= 1;
	int j=0;
	visited[i][j]= 1;
	int start=0;
	
	
	
	if(i==0 || i== (n-1) || j==0 || j==(m-1))
	{
		start=1;
	}
	
	int max= func(arr, n, m,i, j,0,Integer.MAX_VALUE, visited, start);

	
	
	System.out.println(max);
	
	}

	private static int func(char[][] arr, int n,int m, int i, int j, int count, int max,  int[][] visited, int start) {
		// exit condition
		

		
		if(i==0 || i== (n-1) || j==0 || j==(m-1))
		{
			if(start== 1)
			{
				start= 2;
			
			}
			else
			{
				
				if(max > count)
					max= count;
				
				return max;
			}
		}
		
		// cover other all condition
		
		if(i+1<n && arr[i+1][j]=='.' && visited[i+1][j]==0)
		{
			
			visited[i+1][j]=1;
			max= func(arr, n, m,i+1, j, count+1,max, visited,start);
			visited[i+1][j]=0;
			
		}
		
		if(j+1<m && arr[i][j+1]=='.' && visited[i][j+1]==0)
		{
			
			visited[i][j+1]=1;
			max= func(arr, n,m, i, j+1, count+1,max, visited,start);
			visited[i][j+1]=0;
			
		}
		
		if(j-1>=0 && arr[i][j-1]=='.' && visited[i][j-1]==0)
		{
			
			visited[i][j-1]=1;
			max= func(arr, n,m, i, j-1, count+1,max, visited,start);
			visited[i][j-1]=0;
			
		}
		
		if(i-1>=0 && arr[i-1][j]=='.' && visited[i-1][j]==0)
		{
			
			visited[i-1][j]=1;
			max= func(arr, n,m, i-1, j, count+1,max, visited,start);
			visited[i-1][j]=0;
			
		}
		return max;
	}

}
