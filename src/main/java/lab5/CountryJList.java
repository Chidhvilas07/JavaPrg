package lab5;

/*
Q5(a): Develop a Swing program in Java to add the countries 
USA, India, Vietnam, Canada, Denmark, France, Great Britain, 
Japan, Africa, Greenland, Singapore into a JList and display 
them on console whenever the countries are selected on the list.
*/

import javax.swing.*;
import javax.swing.event.*;

public class CountryJList {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country List");

        // List of countries
        String countries[] = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Set position
        list.setBounds(100, 50, 200, 200);

        // Add selection listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Avoid multiple triggering
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected: " + list.getSelectedValue());
                }
            }
        });

        // Add list to frame
        frame.add(list);

        // Frame settings
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}