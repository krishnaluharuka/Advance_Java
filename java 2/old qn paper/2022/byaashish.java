import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class byaashish extends JFrame {
    private int x = 200; // Initial x-coordinate of the image
    private int y = 200; // Initial y-coordinate of the image
    private final int imageSize = 50; // Size of the image

    public byaashish() {
        setTitle("Image Move Demo");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        // Add a KeyAdapter to the JFrame
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                // Update the (x, y) coordinates based on the arrow key pressed
                if (keyCode == KeyEvent.VK_LEFT) x -= 10;
                else if (keyCode == KeyEvent.VK_RIGHT)  x += 10;
                else if (keyCode == KeyEvent.VK_UP) y -= 10;
                else if (keyCode == KeyEvent.VK_DOWN) y += 10;
                repaint();
            }
        });

        // Set focusable to true so that the JFrame can receive key events
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, imageSize, imageSize);
    }

    public static void main(String[] args) {
        new byaashish();
    }
}