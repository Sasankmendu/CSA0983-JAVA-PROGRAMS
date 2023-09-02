import java.io.*;
import java.util.Scanner;
public class electric
{
	public static void main(String[] args)
	{
		int ch,uc,cmr,lmr,cno,i,j;
		System.out.println("ENTER  1 FOR DOMESTIC AND 2 FOR INDUSTRY:");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("ENTER YOUR CONSUMER NUMBER:");
			Scanner d=new Scanner(System.in);
			cno=d.nextInt();
			System.out.println("ENTER YOUR CURRENT MONTH READING:");
			Scanner q=new Scanner(System.in);
			cmr=q.nextInt();
			System.out.println("ENTER YOUR LAST MONTH READING:");
			Scanner e=new Scanner(System.in);
			lmr=e.nextInt();
			System.out.println("YOUR CONSUMER NUMBER IS:"+cno);
			uc=cmr-lmr;
			if(uc<=100)
			{
				System.out.println("YOUR AMOUNT IS:0");
			}
			else if(uc>100 && uc<200)
			{
				System.out.println("YOUR AMOUNT IS:1");
			}
			else if(uc>200 && uc<300)
			{
				System.out.println("YOUR AMOUNT IS:2");
			}
			else if(uc>300 && uc<500)
			{
				System.out.println("YOUR AMOUNT IS:3.50");
			}
			else
			{
				System.out.println("YOUR AMOUNT IS:5");
			}
		}
		else if(ch==2)
		{
			System.out.println("ENTER YOUR CONSUMER NUMBER:");
			Scanner d=new Scanner(System.in);
			cno=d.nextInt();
			System.out.println("ENTER YOUR CURRENT MONTH READING:");
			Scanner q=new Scanner(System.in);
			cmr=q.nextInt();
			System.out.println("ENTER YOUR LAST MONTH READING:");
			Scanner e=new Scanner(System.in);
			lmr=e.nextInt();
			System.out.println("YOUR CONSUMER NUMBER IS:"+cno);
			uc=cmr-lmr;
			if(uc<=100)
			{
				System.out.println("YOUR AMOUNT IS:0");
			}
			else if(uc>100 && uc<200)
			{
				System.out.println("YOUR AMOUNT IS:1.25");
			}
			else if(uc>200 && uc<300)
			{
				System.out.println("YOUR AMOUNT IS:2.50");
			}
			else if(uc>300 && uc<500)
			{
				System.out.println("YOUR AMOUNT IS:4.00");
			}
			else
			{
				System.out.println("YOUR AMOUNT IS:5.40");
			}
		}
		else
		{
			System.out.println("ENTER A VALID INPUT.");
		}
	}
}
				