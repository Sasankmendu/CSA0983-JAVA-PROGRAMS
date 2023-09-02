import java.util.*;
import java.io.*;
public class denominations
{
	public static void main(String args[])
	{
		int a,a1,b,b1,c,c1,d,d1;
		Scanner sc= new Scanner(System.in);
		System.out.println("THE DENOMINATIONS ARE 100,200,500,2000");
		System.out.println("ENTER FIRST DENOMINATION:");
		a=sc.nextInt();
		System.out.println("ENTER THE NUBER OF NOTES:");
		a1=sc.nextInt();
		System.out.println("ENTER SECOND DENOMINATION:");
		b=sc.nextInt();
		System.out.println("ENTER THE NUBER OF NOTES:");
		b1=sc.nextInt();
		System.out.println("ENTER THIRD DENOMINATION:");
		c=sc.nextInt();
		System.out.println("ENTER THE NUBER OF NOTES:");
		c1=sc.nextInt();
		System.out.println("ENTER FOURTH DENOMINATION:");
		d=sc.nextInt();
		System.out.println("ENTER THE NUBER OF NOTES:");
		d1=sc.nextInt();
		if(a==100||a==200||a==500||a==2000&&b==100||b==200||b==500||b==2000&&c==100||c==200||c==500||c==2000&&d==100||d==200||d==500||d==2000)
		{
			int balance=a*a1+b*b1+c*c1+d*d1;
			System.out.println("THE AVAILABLE BALANCE IS:"+balance);
		}
		else
		{
			System.out.println("ENTER CORRECT DENOMINATION.");
		}
	}
}