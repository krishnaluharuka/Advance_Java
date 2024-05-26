import javax.swing.*;
class jmenu
{
    JFrame f;
    JMenuBar m;
    JMenu m1,m2,m3;
    JMenuItem i1,i2,i3,i4,i5,i6;
    jmenu()
    {
        f=new JFrame();
        f.setSize(500,500);

        m=new JMenuBar();
        f.setJMenuBar(m);

        m1=new JMenu("File");
        m.add(m1);

        m2=new JMenu("Edit");
        m.add(m2);

        i1=new JMenuItem("i1");
        m1.add(i1);

        i2=new JMenuItem("i2");
        m1.add(i2);

        i3=new JMenuItem("i3");
        m1.add(i3);

        m3=new JMenu("m3");
        m2.add(m3);

        i4=new JMenuItem("i4");
        m3.add(i4);

        i5=new JMenuItem("i5");
        m3.add(i5);

        i5=new JMenuItem("i5");
        m3.add(i5);


        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new jmenu();
    }
}