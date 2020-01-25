import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HourGlass
{
	public static int hourg(int x,int a[][],int y)
	{
		int sum=0;
		int i,j;
		sum=a[x][y]+a[x][y+1]+a[x][y+2]+a[x+1][y+1]+a[x+2][y]+a[x+2][y+1]+a[x+2][y+2];
		return sum;
	}
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		int a[][]=new int[6][6];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int i,j;
	    for(i=0;i<6;i++)
	    {
	    	for(j=0;j<6;j++)
	    	{
	    		a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		int sum[][]=new int[4][4];
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				sum[i][j]=hourg(i,a,j);
			}
		}
		int max=0;
		for(i=0;i<4;i++)
	    {
	    	for(j=0;j<4;j++)
	    	{
	    		if(sum[i][j]>max)
	    		{
	    			max=sum[i][j];
				}
			}
		}
		System.out.println(max);
	}
}

