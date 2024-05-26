import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class byreeba extends JFrame implements KeyListener {
    private int x = 100; // Initial X-coordinate of the image
    private int y = 100; // Initial Y-coordinate of the image
    private int imageWidth = 50;
    private int imageHeight = 50;

    public byreeba() {
        setTitle("Image Move Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this); // Add key listener to the frame
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw a rectangle (representing an image) at (x, y)
        g.setColor(Color.BLUE);
        g.fillRect(x, y, imageWidth, imageHeight);
    }

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Respond to arrow keys
        if (keyCode == KeyEvent.VK_LEFT) {
            x -= 10; // Move left
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            x += 10; // Move right
        } else if (keyCode == KeyEvent.VK_UP) {
            y -= 10; // Move up
        } else if (keyCode == KeyEvent.VK_DOWN) {
            y += 10; // Move down
        }

        repaint(); // Redraw the image at the new position
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            byreeba demo = new byreeba();
            demo.setVisible(true);
        });
    }
}