package lab5;

/*
Q5(c): Develop a Swing program in Java to add the countries 
USA, India, Vietnam, Canada, Denmark, France, Great Britain, 
Japan, Africa, Greenland, Singapore into a JList and display 
the capital of the countries on console whenever the countries 
are selected on the list.
*/

import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalJList {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country Capitals");

        // Countries array
        String countries[] = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);
        list.setBounds(100, 50, 200, 200);

        // Create HashMap for country-capital mapping
        HashMap<String, String> capitalMap = new HashMap<>();

        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No Single Capital"); // continent
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Add selection listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {

                    String selected = list.getSelectedValue();
                    String capital = capitalMap.get(selected);

                    System.out.println("Country: " + selected);
                    System.out.println("Capital: " + capital);
                    System.out.println();
                }
            }
        });

        // Add to frame
        frame.add(list);

        // Frame settings
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}