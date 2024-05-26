import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class keylistenerapp extends Applet implements KeyListener
{
    public void init()
    {
    addKeyListener(this);
    setLayout(null);
    }
    public void keyPressed(KeyEvent e)
    {
        System.out.println("Key pressed");
    }

    public void keyTyped(KeyEvent e)
    {
        System.out.println("key typed");
    }

    public void keyReleased(KeyEvent e)
    {
        System.out.println("Key released");
    }
}
/*<applet code="keylistenerapp" width="300" height="300"></applet> */