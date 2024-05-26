import java.awt.*;
import java.applet.*;
import java.awt.event.*;


/* <applet code="textfield.class" width="500" height="500"></applet>*/

public class textfield extends Applet 
{
    TextField t1,t2,t3;
    Button b;
    int x,y,z;
    public void init()
    {
        t1=new TextField("first number",20);
        add(t1);
        t2=new TextField("second number",20);
        add(t2);
        b=new Button("send");
        add(b);
        b.addActionListener(new test());
        t3=new TextField("Sum is",12);
        add(t3);
    }

    class test implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource()==b)
            {
                x=Integer.parseInt(t1.getText());
                y=Integer.parseInt(t2.getText());
                z=x+y;
                t3.setText(String.valueOf(z));
            }
        }
    }
    
}
