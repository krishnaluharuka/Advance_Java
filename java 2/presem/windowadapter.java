import java.awt.*;
import java.awt.event.*;
class windowadapter
{
    Frame f;
    windowadapter()
    {
        f=new Frame("Window Adapter");
        f.setSize(100, 100);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent e)
            {
                System.out.println("window activated");
            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new windowadapter();
    }
}
