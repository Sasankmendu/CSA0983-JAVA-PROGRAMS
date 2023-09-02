import java.io.*;
import java.util.Scanner;
import java.util.*;
public class matrix
{
	public static void main(String[] args)
	{
		int i,j;
		int[][] a=new int[3][3];
		System.out.println("ENTER THE ELEMENTS INTO THE MATRIX:");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			system.out.println();
		}
	}
}