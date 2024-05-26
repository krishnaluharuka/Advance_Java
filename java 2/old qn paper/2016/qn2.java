import javax.swing.*;
import java.awt.event.*;

public class qn2 {
    JFrame f;
    JTextField t1,t2,t3;
    JButton b;
    qn2()
    {
        f=new JFrame("Addition");
        f.setSize(500,500);
        
        t1=new JTextField("Enter a number", 20);
        t1.setBounds(0, 0, 150, 20);
        f.add(t1);

        t2=new JTextField("Enter next number", 20);
        t2.setBounds(0, 30, 150, 20);
        f.add(t2);

        t3=new JTextField();
        t3.setBounds(0, 60, 150, 20);

        b=new JButton("Submit");
        b.setBounds(0, 90, 100, 30);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int x=Integer.parseInt(t1.getText());
                int y=Integer.parseInt(t2.getText());
                int z=x+y;
                f.add(t3);
                t3.setText(String.valueOf(z));
            }
        });

        f.setLayout(null);
        f.setVisible(true);
      
    }
    public static void main(String[] args) {
        new qn2();
    }
    
}

