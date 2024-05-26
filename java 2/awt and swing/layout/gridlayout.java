import javax.swing.*;
import java.awt.*;
public class gridlayout
{
    JFrame f;
    JButton one,two,three,four,five,six,seven,eight,nine;
    gridlayout()
    {
        f=new JFrame("Grid layout");
        f.setSize(500,500);
        f.setVisible(true);

        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");

        f.setLayout(new GridLayout());
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new gridlayout();
    }
}