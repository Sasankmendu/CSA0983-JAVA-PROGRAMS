import  java.awt.*;
class diagram
{
	public void user()
	{
		Frame f=new Frame("FIRST");
		f.setSize(400,600);
		f.setVisible(true);
		Panel p=new Panel();
		Button b1=new Button("YES");
		p.add(b1);
		Button b2=new Button("NO");
		p.add(b2);
		Label l1=new Label("ENTER YOUR NAME:");
		p.add(l1);
	}
}
public class diagrams
{
	public static void main(String args[])
	{
		diagram d=new diagram();
		d.user();
	}
}