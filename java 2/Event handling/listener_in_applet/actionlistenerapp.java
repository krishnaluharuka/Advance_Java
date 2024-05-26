import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="actionlistenerapp" width="300" height="300"></applet> */
public class actionlistenerapp extends Applet implements ActionListener{
    Button b;
    TextField tf;
    public void init()
    {
        tf=new TextField();
        tf.setBounds(30,40,150,20);
        b=new Button("Click");
        b.setBounds(80,150,60,50);
        add(tf);
        add(b);
        b.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome to the World");
    }
}