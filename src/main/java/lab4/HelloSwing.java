package lab4;

/*
Q4(a): Basic Hello program of Swing displaying the message 
"Hello! VI C, Welcome to Swing Programming" in Blue color, 
plain font, font size 32 using JFrame and JLabel.
*/

import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Swing Example");

        // Create JLabel
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

        // Set text color to Blue
        label.setForeground(Color.BLUE);

        // Set font style and size
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Center alignment
        label.setHorizontalAlignment(JLabel.CENTER);

        // Add label to frame
        frame.add(label);

        // Frame settings
        frame.setSize(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
