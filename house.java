import java.applet.Applet;
import java.awt.Graphics;
class house extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(300,171,607,341);
		g.drawRect(417,266,488,341);
		g.drawLine(300,171,451,13);
		g.drawLine(451,13,606,169);
	}
}