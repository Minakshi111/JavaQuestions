package Two_D_Array;

import java.util.Scanner;

public class RatInMaze {
	
	public static void main(String [] str)
	{
		Scanner sc= new Scanner(System.in);
		
		int n=3;
		int arr[][]= new int[n][n];
		int [][] visited= new int[n][n];
		
		
		for ( int i=0; i<n;i++)
		{
			for ( int j=0; j<n;j++)
			{
				arr[i][j]= sc.nextInt();
				visited[i][j]=0;
			}
		}
		visited[0][0]=1;
		
		
		int max= rat(arr,n,0,0,0,visited,"",0);
	//	System.out.println("max is: "+max) ;
		
		
	}

	private static int rat(int[][] arr, int n, int i, int j, int count, int [][] visited, String path, int max) {
		
		if(i==n-1 && j==n-1)
		{
			// destination condition
			if(max<count)
				max= count;
			
		// 	System.out.println(count);
		//	System.out.println(path);
			
			return max;
			
		}
		
		// check 4 conditions
		
		if(i+1<n && arr[i+1][j]==1 && visited[i+1][j]==0)
		{
			path= path+"D";
			visited[i+1][j]=1;
			max= rat(arr,n,i+1,j,count+1,visited,path, max);
			visited[i+1][j]=0;
			path= path.substring(0,path.length()-1);
		}
		
		if(j+1<n && arr[i][j+1]==1 && visited[i][j+1]==0)
		{
			path= path+"R";
			visited[i][j+1]=1;
			max= rat(arr,n,i,j+1,count+1,visited,path, max);
			visited[i][j+1]=0;
			path= path.substring(0,path.length()-1);
		}
		
		if(j-1>=0 && arr[i][j-1]==1 && visited[i][j-1]==0)
		{
			path= path+"L";
			visited[i][j-1]=1;
			max= rat(arr,n,i,j-1,count+1,visited,path,max);
			visited[i][j-1]=0;
			path= path.substring(0,path.length()-1);
		}
		
		if(i-1>=0 && arr[i-1][j]==1 && visited[i-1][j]==0)
		{
			path= path+"U";
			visited[i-1][j]=1;
			max= rat(arr,n,i-1,j,count+1,visited,path, max);
			visited[i-1][j]=0;
			path= path.substring(0,path.length()-1);	
		}
		return max;
	}
}