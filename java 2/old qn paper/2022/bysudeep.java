import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class bysudeep implements KeyListener{
    JFrame j;
    JLabel l;
    bysudeep()
    {
        j=new JFrame("Image Move");
        j.setSize(1000,500);
        j.setLayout(null);
        j.setVisible(true);

        l=new JLabel();
        l.setIcon(new ImageIcon("jmc.png"));
        l.setBounds(10,10,900,480);
        j.addKeyListener(this);
        j.add(l);
    }

    public void keyPressed(KeyEvent e)
    {
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_UP)
        {
            l.setLocation(l.getLocation().x,l.getLocation().y-20);
        }
        else if(key==KeyEvent.VK_DOWN)
        {
            l.setLocation(l.getLocation().x,l.getLocation().y+20);
        }
        else if(key==KeyEvent.VK_LEFT)
        {
            l.setLocation(l.getLocation().x-20,l.getLocation().y);
        }
        else if(key==KeyEvent.VK_RIGHT)
        {
            l.setLocation(l.getLocation().x+20,l.getLocation().y);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"invalidss");
        }
    }

    public void keyTyped(KeyEvent e) {
    }
    
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new bysudeep();
    }
}