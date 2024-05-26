import javax.swing.*;
class table
{
    JFrame f;
    JTable t;
    JScrollPane sp;
    table()
    {
        f=new JFrame("My Frame");
        f.setSize(800,800);
        f.setLayout(null);
        String data[][]={{"101","maths","100","40","98"},{"102","web","100","40","98"}};
        String column[]={"sno","Name","full marks","Pass Marks","obt. Marks"};
        t=new JTable(data,column);
        sp=new JScrollPane(t);
        sp.setSize(800,70);
        f.add(sp);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new table();
    }
    
}