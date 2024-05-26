import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class mouselistener implements MouseListener,MouseMotionListener
{
    JFrame j;
    mouselistener(){
        j=new JFrame("Mouse Listener");
        j.setSize(600,600);
        j.addMouseListener(this);
        j.addMouseMotionListener(this);
        j.setVisible(true);
        j.setLayout(null);
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

    public static void main(String args[])
    {
        new mouselistener();
    }
}