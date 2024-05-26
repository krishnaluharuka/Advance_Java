import java.awt.*;
import javax.swing.*;

public class gridbaglayout {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    gridbaglayout()
    {
        f=new JFrame("GridBag Layout");
        f.setSize(500,500);
        f.setLayout(new GridBagLayout());
        f.setVisible(true);

        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        b6=new JButton("Button 6");
        b7=new JButton("Button 7");
        b8=new JButton("Button 8");
        b9=new JButton("Button 9");


        GridBagConstraints g=new GridBagConstraints();

        g.gridx=0;
        g.gridy=0;
        f.add(b1,g);

        g.gridx=1;
        g.gridy=0;
        f.add(b2,g);

        g.gridx=2;
        g.gridy=0;
        f.add(b3,g);

        g.gridx=3;
        g.gridy=0;
        f.add(b4,g);

        g.gridx=0;
        g.gridy=1;
        f.add(b5,g);

        g.gridx=1;
        g.gridy=1;
        f.add(b6,g);

        g.gridx=2;
        g.gridy=1;
        f.add(b7,g);

        g.gridx=0;
        g.gridy=2;
        f.add(b8,g);

        g.gridx=1;
        g.gridy=2;
        f.add(b9,g);

        f.pack();
    }
    public static void main(String[] args) {
        new gridbaglayout();
    }
    
}
