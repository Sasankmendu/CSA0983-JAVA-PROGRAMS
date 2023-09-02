import java.util.*;
import java.io.*;
public class  inttostring
{
	public static String main(String args[])
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ARRAY ELEMENTS");
		n=sc.nextInt();
		int []a=new int[100];
		System.out.println("ENTER THE ELEMENTS INTO THE ARRAY:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(j=0;j<n;j++)
		{
			if(a[j]%3==0 && a[j]%5==0)
			{
				//System.out.println("HEALTH IS WEALTH"); 
				return "HEALTH IS WEALTH";

			}
			else if(a[j]%3==0 && a[j]%5!=0)
			{
				//System.out.println("HEALTH");
				return "HEALTH";
			}
			else if(a[j]%5==0 && a[j]%3!=0)
			{
				//System.out.println("WEALTH");
				return "WEALTH";
			}
			else
			{
				//System.out.println("0");
				return "0";
			}
		}
	}
}