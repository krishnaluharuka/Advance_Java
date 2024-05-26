import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class keylistener implements KeyListener
{
    JFrame j;
    JTextArea a;
    keylistener(){
        j=new JFrame("Key Listener");
        j.setSize(600,600);
        a=new JTextArea();
        a.setSize(200,200);
        j.add(a);
        a.addKeyListener(this);
        j.setLayout(null);
        j.setVisible(true);
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

    

    public static void main(String args[])
    {
        new keylistener();
    }
}