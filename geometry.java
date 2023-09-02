import java.util.*;
import  java.io.*;
 class rectangle
{
	public void rect()
	{
		int l=10;
		int  w=5;
		int  area=l*w;
		System.out.println("THE AREA OF THE RECTANGLE IS "+area);
	}
}
class cuboid extends rectangle
{
	public void cub()
	{
		int h=5;
		int l=6;
		int b=7;
		int area=2*h*(l+b);
		int volume=l*b*h;
		System.out.println("THE AREA OF THE CUBOID IS "+area);
		System.out.println("THE VOLUME OF CUBOID  IS "+volume);
	}
}
public class geometry
{
	public static void main(String args[])
	{
		cuboid C=new cuboid();
		C.rect();
		C.cub();
	}
}	