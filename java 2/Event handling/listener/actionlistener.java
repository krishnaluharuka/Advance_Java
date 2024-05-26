import java.awt.*;
import java.awt.event.*;
class actionlistener implements ActionListener
{
    Frame f;
    Button b1,b2;
    Label l1,l2;
    actionlistener()
    {
        f=new Frame("Action listener");
        f.setSize(500,500);

        b1=new Button("Button 1");
        b1.setBounds(100,100,80,20);
        f.add(b1);
        b1.addActionListener(this);

        b2=new Button("Button 2");
        b2.setBounds(100,140,80,20);
        f.add(b2);
        b2.addActionListener(this);

        l1=new Label("you clicked b1");
        l1.setBounds(200,100,180,20);
        f.add(l1);

        l2=new Label("you clicked b2");
        l2.setBounds(200,140,180,20);
        f.add(l2);

        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            f.remove(l2);
            f.add(l1);
        }  
        else if(e.getSource()==b2)
        {
            f.remove(l1);
            f.add(l2);
        }
    }

    public static void main(String args[])
    {
        new actionlistener();
    }
}
