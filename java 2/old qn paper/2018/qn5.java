import java.applet.*;
import java.awt.*;
public class qn5 extends Applet{
    public void paint(Graphics g)
    {
        String str=getParameter("msg");
        g.drawString(str,50,50);
    }
}
