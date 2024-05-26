import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class qn2 extends Applet
{
    TextField t1,t2,t3;
    Button b1;
    public void init()
    {
        t1=new TextField("Enter a number", 20);
        t2=new TextField("enter one more number", 20);
        t3=new TextField(20);
        b1=new Button("Submit");
        add(t1); add(t2); add(t3); add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 if(e.getSource()==b1){
                    int x=Integer.parseInt(t1.getText());
                    int y=Integer.parseInt(t2.getText());
                    int z=x+y;
                    t3.setText(String.valueOf(z));
                 }}
        });}
}
/* <applet code="qn2.class" width="500" height="500"></applet> */