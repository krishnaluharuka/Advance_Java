import javax.swing.*;

public class qn3 {
    JFrame f;
    JMenuBar b;
    JMenu file,help;
    JMenuItem new1,open,save,exit,about,pdf,jpg;
    qn3()
    {
        f=new JFrame("menu");
        f.setSize(1000,750);

        b=new JMenuBar();
        f.setJMenuBar(b);

        file=new JMenu("File");
        b.add(file);

        help=new JMenu("Help");
        b.add(help);

        new1=new JMenuItem("New");
        file.add(new1);

        open=new JMenuItem("Open");
        file.add(open);

        save=new JMenuItem("Save");
        file.add(save);

        exit=new JMenuItem("Exit");
        file.add(exit);

        about=new JMenuItem("About");
        help.add(about);

        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new qn3();
    }
    
}
