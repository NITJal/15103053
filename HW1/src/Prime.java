import java.util.*;
public class Prime {
	public static void main(String []args)
	{
		int n,i,flag=0,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the end range of the number to find all the prime numbers");
		System.out.print("Integer: ");
		n= in.nextInt();
		System.out.println(2%3);
		for(i=2;i<=n;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
				flag=0;
				break;
				}
				
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
		
		in.close();
		}

}
