import java.io.*;
import java.util.*;
public class Decimal
{
	public static void main(String[] args)
	{
		int  dec,bin,oct,i=0;
		System.out.println("ENTER THE DECIMAL NUMBER:");
		Scanner sc=new Scanner(System.in);
		dec=sc.nextInt();
		int  a[]=new int[100];
		while(dec>0)
		{
			a[i]=dec%2;
			dec=dec/2;
			i=i+1;
			System.out.print(a[i]);
		}
	}
}