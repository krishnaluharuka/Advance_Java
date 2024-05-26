import java.awt.event.*;
import javax.swing.*;
public class login1 {
    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b;
    login1()
    {
        f=new JFrame("Login");
        f.setSize(500, 500);

        l1=new JLabel("Username");
        l1.setBounds(10, 10, 100, 50);
        f.add(l1);

        l2=new JLabel("Password");
        l2.setBounds(10, 70, 100, 50);
        f.add(l2);

        t1=new JTextField();
        t1.setBounds(110, 10, 100, 50);
        f.add(t1);

        t2=new JTextField();
        t2.setBounds(110, 70, 100, 50);
        f.add(t2);

        b=new JButton("Login");
        b.setBounds(70, 150, 70, 50);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                new home();
            }
        });


        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new login1();
        
    }
}
