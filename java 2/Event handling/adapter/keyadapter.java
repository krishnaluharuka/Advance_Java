import java.awt.event.*;
import java.awt.*;
class keyadapter{
    Frame f;
    keyadapter()
    {
        f=new Frame("Key adapter");
        f.setSize(500,500);
        f.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                System.out.println("Key Pressed");
            }
        });
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String args[])
    {
        new keyadapter();
    }
}