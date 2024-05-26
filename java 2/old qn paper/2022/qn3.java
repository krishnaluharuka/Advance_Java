import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

class qn3 implements ActionListener{
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6;
    JButton b[]=new JButton[10];
    int i;
    JTextField t;
    qn3()
    {
        f=new JFrame("Calculator");
        f.setSize(300,500);

        for(int i=0;i<=9;i++)
        {
            b[i]=new JButton();
            f.add(b[i]);
            b[i].addActionListener(this);
        }

        b1=new JButton("+");
        f.add(b1);
        b1.addActionListener(this);

        b2=new JButton("-");
        f.add(b2);
        b2.addActionListener(this);

        b3=new JButton("*");
        f.add(b3);
        b3.addActionListener(this);

        b4=new JButton("/");
        f.add(b4);
        b4.addActionListener(this);


        b5=new JButton("C");
        f.add(b5);
        b5.addActionListener(this);

        b6=new JButton("=");
        f.add(b6);
        b6.addActionListener(this);

        f.setLayout(new GridLayout(4,4));
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {

    }
    public static void main(String[] args) {
        new qn3();
    }
    
}
