import java.awt.*;
import java.awt.Menu;

public class menu
{
    Frame j;
    MenuBar m;
    Menu file,edit,search,view,saveas;
    MenuItem New,open,save,selectall,comment,uncomment,pdf,jpg;
    menu()
    {
        j=new Frame("Menu Example");
        j.setSize(800,800);
        m=new MenuBar();
        j.setMenuBar(m);

        file=new Menu("File");
        m.add(file);

        edit=new Menu("Edit");
        m.add(edit);

        search=new Menu("Search");
        m.add(search);

        view=new Menu("View");
        m.add(view);

        saveas=new Menu("Save as");
        pdf=new MenuItem("Pdf");
        jpg=new MenuItem("jpg");
        saveas.add(pdf);
        saveas.add(jpg);

        New=new MenuItem("New");
        file.add(New);

        open=new MenuItem("Open");
        file.add(open);

        save=new MenuItem("Save");
        file.add(save);

        file.add(saveas);

        selectall=new MenuItem("Select all");
        file.add(selectall);

        comment=new MenuItem("Comment");
        file.add(comment);

        uncomment=new MenuItem("Uncomment");
        file.add(uncomment);

        j.setLayout(null);
        j.setVisible(true);
    
    }

    public static void main(String args[])
    {
        new menu();
    }
}