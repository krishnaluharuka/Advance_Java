import javax.swing.*;
import java.awt.event.*;
class form
{
    JFrame j;
    JLabel l;
    JTextField name,add,no;
    JRadioButton m,f;
    JButton b;
    form()
    {
        j=new JFrame("form");
        j.setSize(800,800);
        l=new JLabel("Registration Form");
        l.setBounds(100,50,500,20);
        j.add(l);

        name=new JTextField("name",25);
        name.setBounds(100, 80, 500, 20);
        j.add(name);

        add=new JTextField("address",25);
        add.setBounds(100, 110, 500, 20);
        j.add(add);

        no=new JTextField("contact number",10);
        no.setBounds(100, 140, 500, 20);
        j.add(no);

        m=new JRadioButton("Male");
        m.setBounds(100,170,80,20);
        j.add(m);

        f=new JRadioButton("Female");
        f.setBounds(190,170,80,20);
        j.add(f);

        b=new JButton("Submit");
        b.setBounds(100,200,150,20);
        b.addActionListener(new test());
        j.add(b);


        j.setLayout(null);
        j.setVisible(true);
    }

    class test implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b)
            {
                System.out.println("Successfully added");
            }
        }
    }
    public static void main(String args[])
    {
        new form();
    }


}