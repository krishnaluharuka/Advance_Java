import javax.swing.*;
import java.awt.*;
public class flowlayout
{
    JFrame f;
    JButton one,two,three,four,five,six,seven;
    flowlayout()
    {
        f=new JFrame("Flow Layout");
        f.setSize(500,500);
        f.setVisible(true);

        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");

        f.setLayout(new FlowLayout());
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new flowlayout();
    }
}