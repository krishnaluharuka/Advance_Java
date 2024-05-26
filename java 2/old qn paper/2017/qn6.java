import javax.swing.*;
import java.awt.event.*;

class qn6 implements ItemListener
{
    JFrame j;
    JComboBox c;
    JTextField t;
    qn6()
    {
          j=new JFrame();
          j.setSize(500,500);

          String s[]={"Ram","Shyam","Hari","Sita"};

          c=new JComboBox(s);
          c.setBounds(100,100,100,50);
          j.add(c);

          t=new JTextField();
          t.setBounds(340,100,100,50);
          j.add(t);

           c.addItemListener(this) ;
          //  {
          //   public void itemStateChanged(ItemEvent e)
          //   {
          //       t.setText((String) c.getSelectedItem());
          //   }
          // });

        // String str=c.getSelectedItem();
        // t.setText(str);

          j.setLayout(null);
        j.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
            {
                t.setText((String) c.getSelectedItem());
            }

    public static void main(String[] args) {
        new qn6();

    }
}