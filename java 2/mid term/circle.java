import java.awt.*;
import java.applet.*;
/*<applet code="circle" height="500" width="500"></applet> */
public class circle extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(20,20,10,10);
        g.drawLine(50,50,50,100);
    }
}
