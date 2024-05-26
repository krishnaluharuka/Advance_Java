import java.awt.event.*;
import java.awt.*;
class mouselistenereg implements MouseListener,MouseMotionListener
{
    Frame g;
    mouselistenereg()
    {
        g=new Frame("Mouse Event");
        g.setSize(500, 500);
        g.addMouseListener(this);
        g.addMouseMotionListener(this);
        g.setVisible(true);
        g.setLayout(null);

    }

    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse Pressed");
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Hello world ");
    }

    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse Entered");
    }

    public void mouseMoved(MouseEvent e)
    {
        System.out.println("Mouse is Hovering");
    }

    public void mouseDragged(MouseEvent e)
    {
        System.out.println("Mouse Dragged");
    }

    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse Released");
    }

    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse Exited");
    }

    public static void main(String args[])
    {
        new mouselistenereg();
    }
}