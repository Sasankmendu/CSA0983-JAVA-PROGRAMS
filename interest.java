import java.io.*;
import java.util.Scanner;
public class interest
{
	public static void main(String args[])
	{
		float p,t,a,r,i;
		System.out.println("ENTER YOUR AGE:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>=60)
		{
			System.out.println("ENTER THE PRINCIPLE AMOUNT:");
			Scanner c=new Scanner(System.in);
			p=c.nextFloat();
			System.out.println("ENTER THE TENURE:");
			Scanner d=new Scanner(System.in);
			t=d.nextFloat();
			r=10/100;
			i=(p*t*r)/100;
			System.out.println("YOUR INTEREST IS:"+i);
		}
		else
		{
			System.out.println("ENTER THE PRINCIPLE AMOUNT:");
			Scanner g=new Scanner(System.in);
			p=g.nextFloat();
			System.out.println("ENTER THE TENURE:");
			Scanner q=new Scanner(System.in);
			t=q.nextFloat();
			r=12/100;
			i=(p * t *  r)/100;
			System.out.println("YOUR INTEREST IS:"+i);
		}
	}
}