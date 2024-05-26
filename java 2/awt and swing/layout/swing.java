import javax.swing.*;

public class swing {
    JFrame j;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    ImageIcon i;
    JTextField t1,t2;
    JButton b;
    JToggleButton tb;
    JCheckBox c;
    ButtonGroup bg;
    JRadioButton r,sa;
    JTabbedPane tp;
    JList l;
    JComboBox cb;
    JTable tbl;
    JScrollPane s;
    swing()
    {
        j=new JFrame("Swing");
        j.setSize(500,500);

        tp=new JTabbedPane();
        tp.setBounds(25,25,450,400);
        j.add(tp);

        i=new ImageIcon("C:\\Users\\Dell\\Desktop\\java 2\\kpk\\jmc.jpg");
        j.add(new JLabel(i));
        
        l1=new JLabel("Registration Form");
        l1.setBounds(50,50,200,20);
        j.add(l1);

        l2=new JLabel("Name");
        l2.setBounds(50,70,100,20);
        j.add(l2);
        
         t1=new JTextField();
         t1.setBounds(150,70,200,20);
         j.add(t1);

        l3=new JLabel("Father's Name");
        l3.setBounds(50,90,100,20);
        j.add(l3);

        t2=new JTextField();
         t2.setBounds(150,90,200,20);
         j.add(t2);

        l4=new JLabel("Nationality");
        l4.setBounds(50,110,100,20);
        j.add(l4);

        String a[]={"Nepali","Indian","Chinese","Japanese"};
        cb=new JComboBox(a);
        cb.setBounds(150,110,200,20);
        j.add(cb);

        l5=new JLabel("Gender");
        l5.setBounds(50,130,100,20);
        j.add(l5);

        bg=new ButtonGroup();

        r=new JRadioButton("Male");
        r.setBounds(150,130,100,20);
        j.add(r);

        sa=new JRadioButton("Female");
        sa.setBounds(250,130,100,20);
        j.add(sa);

        bg.add(r);
        bg.add(sa);

        String data[][]={{"S.L.C.","","","",""},{"10+2","","","",""}};
        String column[]={"Examination","Board or University","Passed year",
        "RollNo","Division"};

        tbl=new JTable(data,column);
        s=new JScrollPane(tbl);
        s.setBounds(50,160,400,50);
        j.add(s);

        l6=new JLabel("Subjects List");
        l6.setBounds(50,220,100,20);
        j.add(l6);

        String sub[]={"Marketing","Economics","Advanced Java"};
        l=new JList(sub);
        l.setBounds(150,220,150,60);
        j.add(l);

        c=new JCheckBox("I agree to all the terms and conditions");
        c.setBounds(50,290,400,20);
        j.add(c);

        
        
        tb=new JToggleButton("On");
        tb.setBounds(50,310,100,20);
        j.add(tb);

        b=new JButton("Submit");
        b.setBounds(160,310,100,20);
        j.add(b);
    
        j.setLayout(null);
        j.setVisible(true);

    }

    public static void main(String[] args) {
        new swing();
    }
    
    
}
