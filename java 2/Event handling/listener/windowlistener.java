import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class windowlistener implements WindowListener
{
    JFrame j;
    windowlistener()
    {
        j=new JFrame("window listener");
        j.setSize(600,600);
        j.addWindowListener(this);
        j.setVisible(true);
       // j.setLayout(null);
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window opened");
    }

    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window closed");
    }

    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window activated");
    }

    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window deactivated");
    }

    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window closing");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window iconified");
    }

    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window deiconified");
    }

    public static void main(String args[])
    {
        new windowlistener();
    }
}