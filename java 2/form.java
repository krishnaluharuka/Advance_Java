import java.awt.*;


class  form
{
    Frame f;
    Label tu,fm,pkr,ad,a,b;
    Label name,dname,gender,nat,dob,fname,add,tel,reg,roll,ex,sig,dash,hobbies,amb,quote,spec;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    TextField  teli;
    Checkbox male,female,singing,dm,studying,learning;
    CheckboxGroup gen;

    form()
    {
        f=new Frame("Form");
        f.setSize(600,700);

        Font f1=new Font("Times New Roman",Font.BOLD,16);
        Font f2=new Font("Times New Roman",Font.ITALIC,14);
        Font f3=new Font("Times New Roman",Font.BOLD,12);
        
        tu=new Label("TRIBHUWAN UNIVERSITY");
        tu.setBounds(200,40,400,20);
        tu.setFont(f1);
        f.add(tu);

        fm=new Label("FACULTY OF MANAGEMENT");
        fm.setBounds(200,60,400,20);
        fm.setFont(f2);
        f.add(fm);

        pkr=new Label("OFFICE OF DEAN");
        pkr.setBounds(240,80,400,20);
        pkr.setFont(f3);
        f.add(pkr);

        ad=new Label("Application Form for Examination of");
        ad.setBounds(200,100,400,20);
        f.add(ad);

        a=new Label("Bachelor of Information Management(BIM)........");
        a.setBounds(180,120,460,20);
        f.add(a);

        b=new Label("Name of College..................................");
        b.setBounds(220,140,460,20);
        f.add(b);

        name=new Label("Full Name in Block Letter:_____________________________________________________");
        name.setBounds(10,180,400,20);
        f.add(name);

        dname=new Label("Full Name in Devanagari:______________________________________________________");
        dname.setBounds(10,200,400,20);
        f.add(dname);

        gender=new Label("Gender");
        gender.setBounds(10,220,50,20);
        f.add(gender);

        gen=new CheckboxGroup();

        male=new Checkbox("Male",gen,false);
        male.setBounds(60,220,60,20);
        f.add(male);

        female=new Checkbox("Female",gen,false);
        female.setBounds(120,220,60,20);
        f.add(female);

        nat=new Label("Nationality:___________________");
        nat.setBounds(200,220,140,20);
        f.add(nat);

        dob=new Label("Date of Birth:______________________");
        dob.setBounds(350,220,180,20);
        f.add(dob);

        fname=new Label("Father's Name:______________________________________________________");
        fname.setBounds(10,240,300,20);
        f.add(fname);

        add=new Label("Mailing Address:______________________________________________________");
        add.setBounds(10,260,300,20);
        f.add(add);

        tel=new Label("Telephone No: ");
        tel.setBounds(330,260,180,20);
        f.add(tel);

        reg=new Label("T.U. Registration No._________________________________ ");
        reg.setBounds(10,280,200,20);
        f.add(reg);

        roll=new Label("Exam Roll No: ");
        roll.setBounds(250,280,100,20);
        f.add(roll);

        teli=new TextField();
        teli.setBounds(350,280,120,20);
        f.add(teli);
        
        ex=new Label("Examination Passed:");
        ex.setBounds(10,320,200,20);
        f.add(ex);

        t1=new TextField("   Examination");
        t1.setBounds(10,340,100,20);
        f.add(t1);

        t2=new TextField("   Board or University");
        t2.setBounds(110,340,150,20);
        f.add(t2);

        t3=new TextField("   Passed Year");
        t3.setBounds(260,340,100,20);
        f.add(t3);

        t4=new TextField("  Roll No.");
        t4.setBounds(360,340,100,20);
        f.add(t4);

        t5=new TextField("  Division");
        t5.setBounds(460,340,100,20);
        f.add(t5);

        t6=new TextField("    S.L.C");
        t6.setBounds(10,360,100,20);
        f.add(t6);

        t7=new TextField("");
        t7.setBounds(110,360,150,20);
        f.add(t7);

        t8=new TextField("   ");
        t8.setBounds(260,360,100,20);
        f.add(t8);

        t9=new TextField(" ");
        t9.setBounds(360,360,100,20);
        f.add(t9);

        t10=new TextField("");
        t10.setBounds(460,360,100,20);
        f.add(t10);

        t11=new TextField("    PCL/10+2");
        t11.setBounds(10,380,100,20);
        f.add(t11);

        t12=new TextField("");
        t12.setBounds(110,380,150,20);
        f.add(t12);

        t13=new TextField("   ");
        t13.setBounds(260,380,100,20);
        f.add(t13);

        t14=new TextField(" ");
        t14.setBounds(360,380,100,20);
        f.add(t14);

        t15=new TextField("");
        t15.setBounds(460,380,100,20);
        f.add(t15);

        hobbies=new Label("What are your hobbies?");
        hobbies.setBounds(10,420,150,20);
        f.add(hobbies);

        // singing,dm,studying,learning

        singing=new Checkbox("Singing");
        singing.setBounds(160,420,100,20);
        f.add(singing);

        dm=new Checkbox("Speaking");
        dm.setBounds(160,440,100,20);
        f.add(dm);

        learning=new Checkbox("Learning");
        learning.setBounds(160,460,100,20);
        f.add(learning);

        studying=new Checkbox("Gardening");
        studying.setBounds(160,480,100,20);
        f.add(studying);

        amb=new Label("What is your Ambition?______________________________________________________________________");
        amb.setBounds(10,510,400,20);
        f.add(amb);

        quote=new Label("Write a quote that inspire you:________________________________________________________________________");
        quote.setBounds(10,540,400,20);
        f.add(quote);

        spec=new Label("What's you speciality?");
        spec.setBounds(10,570,400,20);
        f.add(spec);

        sig=new Label("Signature of the Applicant");
        sig.setBounds(380,650,200,20);
        f.add(sig);

        dash=new Label("____________________");
        dash.setBounds(380,630,200,20);
        f.add(dash);



        
        f.setLayout(null);
        f.setVisible(true);
        
        
    }

    public static void main(String args[])
    {
        new form();
    }
}