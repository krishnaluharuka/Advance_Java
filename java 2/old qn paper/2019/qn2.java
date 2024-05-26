import java.awt.*;
import java.awt.event.*;

public class qn2 implements ActionListener{
    Frame f;
    Button b1,b2,b3;
    TextField t;
    qn2()
    {
        f=new Frame("Color");
        f.setSize(500,500);

        
        b1=new Button("red");
        b1.setBounds(100,100,100,20);
        f.add(b1);
        b1.addActionListener(this);

        b2=new Button("blue");
        b2.setBounds(100,130,100,20);
        f.add(b2);
        b2.addActionListener(this);

        b3=new Button("green");
        b3.setBounds(100,160,100,20);
        f.add(b3);
        b3.addActionListener(this);

        t=new TextField();
        t.setBounds(100,70,100,20);
        f.add(t);

        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==  b1)
        {
            t.setText("red");
        }
        else if(e.getSource()==  b2)
        {
            t.setText("blue");
        }
        else if(e.getSource()==  b3)
        {
            t.setText("green");
        }
    }
    public static void main(String[] args) {
        new qn2();
    }
}
