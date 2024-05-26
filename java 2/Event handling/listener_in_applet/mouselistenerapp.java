import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouselistenerapp extends Applet implements MouseListener,MouseMotionListener
{
    public void init()
    {
    addMouseListener(this);
    addMouseMotionListener(this);
    setLayout(null);
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse entered");
    }

    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse exited");
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse clicked");
    }

    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse released");
    }

    public void mouseMoved(MouseEvent e)
    {
        System.out.println("Mouse moved");
    }

    public void mouseDragged(MouseEvent e)
    {
        System.out.println("Mouse dragged");
    }
    
}
/*<applet code="mouselistenerapp" width="300" height="300"></applet> */