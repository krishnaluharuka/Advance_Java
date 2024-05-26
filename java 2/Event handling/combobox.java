import javax.swing.*;
class combobox
{
    JFrame f;
    JComboBox c;
    JTable t;
    JScrollPane sp;
    combobox()
    {
        f=new JFrame("My Frame");
        f.setSize(800,800);
        f.setLayout(null);
        DefaultListModel<String> l1=new DefaultListModel<>();
        l1.addElement("Item 1");
        l1.addElement("Item  2");
        l1.addElement("Item 3");
        l1.addElement("Item 4");
        l1.addElement("Item 5");
        JList<String> list=new JList(l1);
        list.setBounds(500,500,200,100);
        f.add(list);
        
        String a[]={"Nepal","India","ChINA","Bangladesh","Japan"};
        String data[][]={{"101","Krishna","347000"},{"102","Krish","34000"},
        {"103","Krishika","340000"},{"104","Trishna","340900"}};
        String column[]={"ID","Name","Salary"};
        c=new JComboBox(a);
        c.setBounds(100,100,200,50);
        t=new JTable(data,column);
        sp=new JScrollPane(t);
        sp.setSize(800,70);
        f.add(sp);

        f.add(c);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new combobox();
    }
    
}