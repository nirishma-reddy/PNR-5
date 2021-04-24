import java.awt.*;
import java.awt.event.*;
public class Add1Frame extends Frame
{
public Add1Frame()
{
}
public void paint(Graphics g)
{
g.drawString("First Applet",100,100);
}
public static void main(String [] args)
{
Add1Frame af = new Add1Frame();
af.setSize(400,400);
af.setVisible(true);
}
}