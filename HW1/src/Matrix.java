import java.util.*;
public class Matrix 
{
	public static void main(String []args)
	{
	int i,j,k,n;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number for nxn matrix");
	n=in.nextInt();
	int a[][]=new int[n][n];
	int b[][]=new int[n][n];
	int c[][]=new int[n][n];
	//i=in.nextInt();
	//j=in.nextInt();
	System.out.println("Enter the first matrix input");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=in.nextInt();
		}
	}
	System.out.println("Enter the second matrix input");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			b[i][j]=in.nextInt();
		}
	}
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			for(k=0;k<n;k++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
	}
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(" "+c[i][j]+" ");
		}
		System.out.println();
	}
	in.close();
	}
	
}
