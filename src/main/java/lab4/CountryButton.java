package lab4;

/*
Q4(b): Develop a Swing program to display message 
"India is pressed" or "Srilanka is pressed" inside the JFrame 
using JLabel depending upon the JButton clicked using addActionListener().
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButton {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country Button Event");

        // Create Buttons
        JButton indiaBtn = new JButton("India");
        JButton sriBtn = new JButton("Srilanka");

        // Create Label to display message
        JLabel label = new JLabel("Click a button");
        label.setBounds(150, 50, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Set button positions
        indiaBtn.setBounds(100, 120, 120, 40);
        sriBtn.setBounds(250, 120, 120, 40);

        // Action for India button
        indiaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Action for Srilanka button
        sriBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(indiaBtn);
        frame.add(sriBtn);
        frame.add(label);

        // Frame settings
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
