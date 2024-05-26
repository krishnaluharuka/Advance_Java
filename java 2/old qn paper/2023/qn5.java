import javax.swing.*;
import java.awt.event.*;

public class qn5 {
    JFrame f;
    JButton b;

    qn5() {
        f = new JFrame("Hiding");
        f.setSize(500, 500);

        b = new JButton("Hide Me");
        b.setBounds(100, 150, 150, 50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b){
                     b.setVisible(false);
                } 
            }
        });

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new qn5();
    }

}
