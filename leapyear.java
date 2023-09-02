import java.util.*;
import java.io.*;
public class leapyear
{
	public static void main(String args[])
	{
		int year;
		System.out.println("ENTER THE YEAR:");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%4==0 && year%100!=0 && year%400==0)
		{
			System.out.println("THE ENTERED YEAR IS A LEAP YEAR.");
		}
		else
		{
			System.out.println("THE ENTERED YEAR IS NOT A LEAP YEAR.");
		}
	}
}