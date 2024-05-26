import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Geeky Shows",50,10);
        g.setColor(Color.GRAY);
        g.drawLine(20,20,20,80);
        g.drawRect(50,20,50,20);
        g.drawOval(110,20,20,20);
        g.drawArc(140,20,30,30,30,90);
        g.setColor(Color.black);
        g.fillRect(50,50,50,20);
        g.fillOval(110,50,20,20);
        g.fillArc(140,50,30,30,30,90);

    }
}
/*<APPLET code="Myapplet" width="250" height="180"></APPLET>*/




