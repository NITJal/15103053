import java.util.*;
public class Palindrome 
{
	public static void main(String []args)
	{
		int length,i;
		String og,rev="";
		Scanner in=new Scanner(System.in);
		System.out.print("Enter string to check: ");
		og=in.nextLine();
		length=og.length();
		for(i=length-1;i>=0;i--)
		{
			rev=rev+og.charAt(i);
		}
		if(og.equals(rev))
		{
			System.out.println("A Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
		in.close();
	}
}
