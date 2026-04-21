package lab5;

/*
Q5(d): Develop a Swing program in Java to create a Tabbed Pan of 
Cyan, Magenta and Yellow and display the concerned color whenever 
the specific tab is selected in the Pan.
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneCMY {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Tabbed Pane CMY");

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Set background colors
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Listener for tab change
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();
                String selectedTab = tabbedPane.getTitleAt(index);

                System.out.println("Selected Tab: " + selectedTab);
            }
        });

        // Add to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
