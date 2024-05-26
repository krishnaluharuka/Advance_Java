import java.awt.event.*;
import java.awt.*;
class mouseadapter
{
    Frame f;
    int i;
    mouseadapter()
    {
        f=new Frame("mouse adapter");
        f.setSize(500,500);
        f.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                i++;
                
                System.out.println("Mouse clicked");
                System.out.println("You clicked "+i+" times");
            }
        });
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String args[])
    {
        new mouseadapter();
    }
}