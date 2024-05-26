import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class windowlistenerapp extends Applet implements WindowListener
{
    public void init()
    {
    addWindowListener(this); 
    setLayout(null);
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
    
}
/*<applet code="windowlistenerapp" width="300" height="300"></applet> */