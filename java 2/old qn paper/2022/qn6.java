import javax.swing.*;
import java.awt.event.*;

public class qn6 {
    JFrame j;
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;
    qn6()
    {
        j=new JFrame("Large or Small");
        j.setSize(500,500);

        t1=new JTextField("enter a number");
        t1.setBounds(100,100,150,20);
        j.add(t1);

        t2=new JTextField("enter second number");
        t2.setBounds(100,130,150,20);
        j.add(t2);

        b1=new JButton("Large");
        b1.setBounds(100,160,80,20);
        j.add(b1);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            if(x>y)
            {
                l.setText(String.valueOf(x));
            }
            else
            {
                l.setText(String.valueOf(y));
            }
            }
        });

        b2=new JButton("Small");
        b2.setBounds(155,160,80,20);
        j.add(b2);

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            if(x<y)
            {
                l.setText(String.valueOf(x));
            }
            else
            {
                l.setText(String.valueOf(y));
            }
            }
        });

        

        l=new JLabel();
        l.setBounds(100,190,150,20);
        j.add(l);





        j.setLayout(null);
        j.setVisible(true);

    }
    public static void main(String[] args) {
        new qn6();
    }
}
