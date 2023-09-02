import java.util.*;
import java.io.*;
import java.util.*;
public class inventor
{
	public static void main(String args[])
	{
		String q,a[];
		int i;
		System.out.println("WHO IS THE INVENTOR OF JAVA PROGRAMMING");
		for(i=1;i<=3;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextLine();
			if(a[i]=="JAMES GOSLING" || a[i]=="james gosling")
			{
				System.out.println("GOOD");
				break;
			}
			else
			{
				System.out.println("PLEASE TRY AGAIN");
			}
		}
		if(i==4)
		{
			System.out.println("AS THE ANSWER IS WRONG THREE TIMES THE ANSWER IS JAMES GOSLING.");
		}
	}
} 