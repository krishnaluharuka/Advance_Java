import javax.swing.*;
import java.awt.event.*;


public class qn6 implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b1,b2;
    qn6()
    {
        f=new JFrame("button");
        f.setSize(500,500);

        t=new JTextField();
        t.setBounds(100,60,100,20);
        t.setEditable(false);

        b1=new JButton("OK");
        b1.setBounds(100,100,100,20);
        f.add(b1);
        b1.addActionListener(this);

        // b1.addActionListener(new ActionListener()
        // {
        //     public void actionPerformed(ActionEvent e)
        //     {
        //         f.add(t);
        //         t.setText("Welcome");
        //     }
        // });

        b2=new JButton("Clear");
        b2.setBounds(100,130,100,20);
        f.add(b2);
        b2.addActionListener(this);

        // b2.addActionListener(new ActionListener()
        // {
        //     public void actionPerformed(ActionEvent e)
        //     {
        //         f.add(t);
        //         t.setText("");
        //     }
        // });

        f.setLayout(null);
        f.setVisible(true);
    }



    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
        f.add(t);
        t.setText("");
        }
        else if(e.getSource()==b1)
        {
            f.add(t);
            t.setText("Welcome"); 
        }
    }

        
    public static void main(String[] args) {
        new qn6();

    }
    
}
