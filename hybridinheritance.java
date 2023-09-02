class A
{
	public void disp()
	{
		System.out.println("I AM PARENT");
	}
}
class B extends A
{
	public void disp1()
	{
		System.out.println("I AM CHILD 1");
	}
}
interface D
{
	public void disp2();
}
class C extends B implements D
{
	public void disp2()
	{
		System.out.println("I AM CHILD 2");
	}
}
class HI
{
	public static void main(String args[])
	{
		C c=new C();
		c.disp2();
		c.disp1();
		c.disp();
	}
}