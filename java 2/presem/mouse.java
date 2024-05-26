import java.awt.*;
import java.awt.event.*;
class mouse
{
    Frame f; int i;
    mouse()
    {
        f=new Frame("Mouse event");
        f.setSize(500,500);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                i++;
                System.out.println("Mouse clicked");
                System.out.println("Mouse is clicked"+i+"number of times");
            }
        });
        f.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e)
            {
                System.out.println("Mouse is moved");
            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new mouse();}
}