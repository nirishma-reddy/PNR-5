import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="CBApplet" width=300 height=300>
//</applet>
public class CBApplet extends Applet implements ItemListener
{
Choice c;
public void init()
{
label l=new Label("Select any one item");
c=new Choice();
c.add("Red");c.add("Green");c.add("Blue");
c.addItemListener(this);
add(l);add(c);
}
public void itemStateChanged(ItemEvent ae)
{
String s=c.getSelectedItem();
if(s.equals("Green"))
setBackground(Color.green);
else if(s.equals("Red"))
setBackground(Color.red);
else 
setBackground(Color.blue);
repaint();
}
}