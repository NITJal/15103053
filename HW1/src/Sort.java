import java.util.*;
public class Sort {
	public static void main(String []args)
	{
		int i,n,j;
		String temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of names that you want to enter");
		n=in.nextInt();
		String[] names= new String[n];
		Scanner inn=new Scanner(System.in);
		System.out.println("Names are:");
		for(i=0;i<n;i++)
		{
			names[i]=inn.nextLine();
		}
		System.out.println("The sorted names are: ");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(names[i]);
		}
		in.close();
		inn.close();
	}

}
