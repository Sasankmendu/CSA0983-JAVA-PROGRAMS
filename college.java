import java.io.*;
import java.util.Scanner;
public class college
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("ENTER THE TOTAL NUMBER OF STUDENTS:");
		Scanner a=new Scanner();
		a.nextInt();
		System.out.println("ENTER THE NUMBER OF BOYS:");
		Scanner b=new Scanner();
		b.nextInt();
		c=a+b;
		System.out.println("TOTAL NUMBER OF GIRLS ARE:"+c);
	}
}