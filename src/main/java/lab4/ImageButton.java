package lab4;
/*
Q4(c): Develop a Swing program in Java to display a message 
“Digital Clock is pressed” or “Hour Glass is pressed” depending 
upon the Jbutton with image either Digital Clock or Hour Glass is
 pressed by implementing the event handling mechanism with addActionListener( ).
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButton {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Image Button Event");

        // --------------------------------------------------
        // Load Images (Replace with your file paths)
        // --------------------------------------------------
        ImageIcon digitalIcon = new ImageIcon("C:/Users/adith/eclipse-workspace/1st/src/main/java/lab4/digitalclock.jpg");   // your image
        ImageIcon hourIcon = new ImageIcon("C:/Users/adith/eclipse-workspace/1st/src/main/java/lab4/hourglass.jpeg");    // your image
        
        // 🔥 Resize images (VERY IMPORTANT)
        Image img1 = digitalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image img2 = hourIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        
        digitalIcon = new ImageIcon(img1);
        hourIcon = new ImageIcon(img2);
        // Create buttons ONLY with images
        JButton digitalBtn = new JButton(digitalIcon);
        JButton hourBtn = new JButton(hourIcon);

        // Remove button borders (optional for clean look)
        digitalBtn.setBorderPainted(false);
        digitalBtn.setContentAreaFilled(false);

        hourBtn.setBorderPainted(false);
        hourBtn.setContentAreaFilled(false);

        // Label to display message
        JLabel label = new JLabel("Click an image");
        label.setBounds(180, 30, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Set button positions
        digitalBtn.setBounds(100, 80, 120, 120);
        hourBtn.setBounds(280, 80, 120, 120);

        // --------------------------------------------------
        // Event Handling
        // --------------------------------------------------
        digitalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        hourBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(digitalBtn);
        frame.add(hourBtn);
        frame.add(label);

        // Frame settings
        frame.setSize(550, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
