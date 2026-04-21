package lab5;
/*
Q5(b): Develop a Swing program in Java to create a Tabbed Pan of 
RED, BLUE and GREEN and display the concerned color whenever 
the specific tab is selected in the Pan.
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneColors {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Tabbed Pane Example");

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Set background colors
        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add ChangeListener to detect tab selection
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);

                System.out.println("Selected Tab: " + title);
            }
        });

        // Add tabbedPane to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
