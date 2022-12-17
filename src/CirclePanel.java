import java.awt.Graphics;
import javax.swing.JPanel;

public class CirclePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;  // x-Koordinate des oberen linken Eckpunkts des Rechtecks
        int y = 50;  // y-Koordinate des oberen linken Eckpunkts des Rechtecks
        int width = 100;  // Breite des Rechtecks
        int height = 100;  // Höhe des Rechtecks
        g.drawOval(x, y, width, height);
    }
}
