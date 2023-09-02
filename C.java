class p
{
	int x=10;
	public void display()
	{
		System.out.println("10");
	}
}
class C extends p
{
	int y=5;
	public void display1()
	{
		System.out.println("5");
	}
}
class inheritance
{
	public static void main(String args[])
	{
		C c=new C();
		c.display1();
		c.display();
	}
}