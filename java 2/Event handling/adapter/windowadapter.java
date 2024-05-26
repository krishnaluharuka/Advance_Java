import java.awt.event.*;
import java.awt.*;
class windowadapter{
    Frame f;
    windowadapter()
    {
        f=new Frame("Window adapter");
        f.setSize(500,500);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowActivated(WindowEvent e)
            {
                System.out.println("Window Activated");
            }
        });
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String args[])
    {
        new windowadapter();
    }
}