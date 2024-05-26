import javax.swing.*;
class swing{
    JFrame f;
    JRadioButton male,female;
    ButtonGroup bg,rbmi;
    JMenuBar m;
    JMenu file,edit,search,view,saveas;
    JMenuItem New,open,save,selectall,comment,uncomment;
    JRadioButtonMenuItem pdf1,doc;
    JCheckBoxMenuItem A,b,c;
    swing()
    {
        f=new JFrame("My Frame");
        f.setSize(800,800);

        bg=new ButtonGroup();

        male=new JRadioButton("Male");
        male.setBounds(200,200,100,50);
        f.add(male);

        female=new JRadioButton("Female");
        female.setBounds(300,200,100,50);
        f.add(female);

        bg.add(male);
        bg.add(female);

        m=new JMenuBar();
        f.setJMenuBar(m);

        file=new JMenu("File");
        m.add(file);

        edit=new JMenu("Edit");
        m.add(edit);

        search=new JMenu("Search");
        m.add(search);

        view=new JMenu("View");
        m.add(view);

        saveas=new JMenu("Save as");
        
        rbmi=new ButtonGroup();
        pdf1=new JRadioButtonMenuItem("pdf");
        doc=new JRadioButtonMenuItem("doc");
        saveas.add(pdf1);
        rbmi.add(pdf1);
        saveas.add(doc);
        rbmi.add(doc);

        New=new JMenuItem("New");
        file.add(New);

        open=new JMenuItem("Open");
        file.add(open);

        save=new JMenuItem("Save");
        file.add(save);

        file.add(saveas);

        selectall=new JMenuItem("Select all");
        file.add(selectall);

        comment=new JMenuItem("Comment");
        file.add(comment);

        uncomment=new JMenuItem("Uncomment");
        file.add(uncomment);

        f.setLayout(null);
        f.setVisible(true);
    
    }
    public static void main(String[] args)
    {
        new swing();
    }
}