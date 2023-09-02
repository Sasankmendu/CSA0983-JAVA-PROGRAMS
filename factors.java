import java.util.*;
import java.io.*;
public class factors
{
	public static void main(String args[])
	{
		int b,n,k,i,j=0;
		int []a= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		n=sc.nextInt();
		System.out.println("ENTER THE Nth VALUE:");
		b=sc.nextInt();
		for(i=1;i<=n;++i)
		{
			if(n%i==0)
			{
				a[j]=i;
				j++;
			}
		}
		for(k=j;k>=0;k--)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println("THE "+b+"th FACTOR OF "+n+" IS:"+a[b-1]);
	}
}