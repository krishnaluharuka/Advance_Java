import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*<applet code="qn5.class" width=500 height=500 ></applet>*/
public class qn5 extends Applet{
    TextField t1,t2,t3;
    Button b1,b2;

    public void init()
    {
        t1=new TextField("Enter a number",20);
        add(t1);

        t2=new TextField("Enter second number",20);
        add(t2);

        t3=new TextField("",20);
        add(t3);
        t3.setEditable(false);

        b1=new Button("Add");
        add(b1);

        b2=new Button("Subtract");
        add(b2);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int x=Integer.parseInt(t1.getText());
                int y=Integer.parseInt(t2.getText());
                int z=x+y;
                t3.setText(String.valueOf(z));
            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int x=Integer.parseInt(t1.getText());
                int y=Integer.parseInt(t2.getText());
                int z=x-y;
                t3.setText(String.valueOf(z));
            }
        });



    }
    
}
