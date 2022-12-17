import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Ampel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        frame.add(northPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();
        frame.add(southPanel, BorderLayout.SOUTH);

        // CirclePanel panel_rot = new CirclePanel();
        //frame.add(panel_rot);
        //CirclePanel panel_gelb = new CirclePanel();
        //frame.add(panel_gelb, BorderLayout.CENTER);
        //CirclePanel panel_gruen = new CirclePanel();
        //frame.add(panel_gruen,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }
}