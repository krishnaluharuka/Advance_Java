import javax.swing.*;
import java.awt.*;
public class borderlayout
{
    JFrame f;
    JButton north,south,east,west,center;
    borderlayout()
    {
        f=new JFrame("border layout");
        f.setSize(500,500);
        f.setVisible(true);

        east=new JButton("East");
        west=new JButton("West");
        north=new JButton("North");
        south=new JButton("South");
        center=new JButton("Center");

        f.setLayout(new BorderLayout());
        f.add(east,BorderLayout.EAST);
        f.add(west,BorderLayout.WEST);
        f.add(north,BorderLayout.NORTH);
        f.add(south,BorderLayout.SOUTH);
        f.add(center,BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new borderlayout();
    }
}