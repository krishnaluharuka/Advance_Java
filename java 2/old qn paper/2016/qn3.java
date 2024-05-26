import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

public class qn3 extends Applet{
    JTextField t1;
    JButton b;
    public void init()
    {
        
        t1=new JTextField("Enter a word", 20);
        t1.setBounds(0, 0, 150, 20);
        add(t1);

        b=new JButton("Submit");
        b.setBounds(0, 90, 100, 30);
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String x=t1.getText();
                if(x.length()==5)
                {
                    System.out.println("The word is of length 5");
                }
                else{
                    System.out.println("Not");
                }
                
            }
        });

        setLayout(null);
        setVisible(true);
    }
}
 /*<applet code="qn3" width="500" height="500"> </applet>*/