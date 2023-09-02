import java.util.*;
import java.io.*;
public class days
{
	public static void main(String args[])
	{
		int a,b,n,d,y,m,w;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF DAYS:");
		n=sc.nextInt();
		y=n/365;
		a=n%365;
		m=a/30;
		b=a%30;
		w=b/7;
		d=b%7;
		System.out.println(y +"  YEARS "+m+" MONTHS "+w+" WEEKS "+d+" DAYS ");
	}
}