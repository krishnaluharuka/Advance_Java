import java.awt.event.*;
import java.awt.*;


public class qn6 implements MouseListener{

    Frame f;
    qn6()
    {
        f=new Frame("Mouse Listener");
        f.setSize(500,500);
        f.addMouseListener(this);

        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse Released");
    }

    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse Exited");
    }
    public static void main(String[] args) {
        new qn6();
    }

    
}
