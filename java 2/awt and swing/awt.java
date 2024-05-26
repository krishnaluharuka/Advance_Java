import java.awt.*;
class awt
{
    Frame f;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    Image icon;
    Button b1,b2;
    Checkbox c1,c2,c3,c4;
    Choice ch1;
    List list;
    Scrollbar s;
    TextField t1,t2,t3,t4;
    TextArea text;
    Font f1,f2;
    awt()
    {
        f=new Frame("Registration Form");
        f.setSize(800,700);
        f1=new Font("Times New Roman",Font.BOLD,28);
        f2=new Font("Times New Roman",Font.PLAIN,22);

        s=new Scrollbar();
        s.setBounds(670,0,30,1000);
        f.add(s);

        l1=new Label("Registration Form");
        l1.setBounds(200, 50, 800, 50);
        l1.setFont(f1);
        f.add(l1);

        l2=new Label("Name:");
        l2.setBounds(100, 100, 150, 30);
        l2.setFont(f2);
        f.add(l2);

        t2=new TextField(" ");
        t2.setBounds(250,100,300,30);
        t2.setFont(f2);
        f.add(t2);





        l3=new Label("Father's Name:");
        l3.setBounds(100, 150, 150, 30);
        l3.setFont(f2);
        f.add(l3);

        t3=new TextField(" ");
        t3.setBounds(250,150,300,30);
        t3.setFont(f2);
        f.add(t3);

        l4=new Label("Age:");
        l4.setBounds(100, 200, 150, 30);
        l4.setFont(f2);
        f.add(l4);

        t4=new TextField(" ");
        t4.setBounds(250,200,300,30);
        t4.setFont(f2);
        f.add(t4);

        l5=new Label("Course:");
        l5.setBounds(100, 250, 150, 30);
        l5.setFont(f2);
        f.add(l5);

        ch1=new Choice();
        ch1.setBounds(250,250,300,30);
        ch1.add("C");
        ch1.add("C++");
        ch1.add("Java");
        ch1.add("Python");
        ch1.add("C#");
        f.add(ch1);

        l6=new Label("Hobbies:");
        l6.setBounds(100, 300, 150, 30);
        l6.setFont(f2);
        f.add(l6);

        c1=new Checkbox("Drawing");
        c1.setBounds(250, 300, 75, 30);
        f.add(c1);

        c2=new Checkbox("Singing");
        c2.setBounds(325, 300, 75, 30);
        f.add(c2);

         c3=new Checkbox("Music");
        c3.setBounds(400, 300, 75, 30);
        f.add(c3);

        c4=new Checkbox("Others");
        c4.setBounds(475, 300, 75, 30);
        f.add(c4);

        l7=new Label("Address:");
        l7.setBounds(100, 350, 150, 30);
        l7.setFont(f2);
        f.add(l7);

        text=new TextArea(10,30);
        text.setBounds(250, 350, 300, 100);
        f.add(text);

        l8=new Label("Favourite Singer:");
        l8.setBounds(100, 500, 150, 30);
        l8.setFont(f2);
        f.add(l8);


        list=new List(5);
        list.setBounds(250,500,300,60);
        list.add("Arijit Singh");
        list.add("Atif Aslam");
        f.add(list);

        b1=new Button("Submit");
        b1.setBounds(100, 570, 150, 30);
        f.add(b1);



        f.setLayout(null);
        f.setVisible(true);
    }

 public static void main(String[] args) {
    new awt();
    
 }
}