import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class qn7 extends JFrame implements KeyListener {
    JLabel l;
    int x = 0, y = 0;

    public qn7() {
        setTitle("KeyEventDemo");
        setSize(300, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel("Press any key on the keyboard");
        add(l);
        addKeyListener(this);
        setVisible(true);
    }

    public void keyPressed(KeyEvent ke) {
        l.setText("You pressed: " + ke.getKeyChar());
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 10;
            l.setLocation(x, y);
        } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 10;
            l.setLocation(x, y);
        } else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            y -= 10;
            l.setLocation(x, y);
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 10;
            l.setLocation(x, y);
        }
    }

    public void keyReleased(KeyEvent ke) {
        l.setText("You released: " + ke.getKeyChar());
    }

    public void keyTyped(KeyEvent ke) {
        l.setText("You typed: " + ke.getKeyChar());
    }

    public static void main(String[] args) {
        new qn7();
    }
}