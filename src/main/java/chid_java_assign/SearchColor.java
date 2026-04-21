package chid_java_assign;

/*
Q1(b): ArrayList Programs

1. Search whether the color "Red" is available or not
2. Remove the 2nd element and color "Blue"
3. Sort the colors using Collections.sort()
4. Extract 1st and 2nd elements using subList()
5. Delete nth element using remove by index
*/

import java.util.*;

public class SearchColor {
    public static void main(String[] args) {

        // Creating ArrayList with colors
        ArrayList<String> colors = new ArrayList<>(
                Arrays.asList("Red", "Blue", "Green", "Yellow")
        );

        System.out.println("Original List: " + colors);

        // --------------------------------------------------
        // 1. Search for "Red"
        // --------------------------------------------------
        if (colors.contains("Red")) {
            System.out.println("1. Red color is available.");
        } else {
            System.out.println("1. Red color is not available.");
        }

        // --------------------------------------------------
        // 2. Remove 2nd element and "Blue"
        // --------------------------------------------------
        ArrayList<String> list2 = new ArrayList<>(colors); // copy list
        list2.remove(1); // remove 2nd element
        list2.remove("Blue"); // remove Blue if exists
        System.out.println("2. After removing 2nd element and Blue: " + list2);

        // --------------------------------------------------
        // 3. Sort colors
        // --------------------------------------------------
        ArrayList<String> list3 = new ArrayList<>(colors);
        Collections.sort(list3);
        System.out.println("3. Sorted List: " + list3);

        // --------------------------------------------------
        // 4. Extract sublist (1st and 2nd elements)
        // --------------------------------------------------
        List<String> sub = colors.subList(0, 2);
        System.out.println("4. Sublist (1st & 2nd): " + sub);

        // --------------------------------------------------
        // 5. Remove nth element
        // --------------------------------------------------
        ArrayList<String> list5 = new ArrayList<>(colors);
        int n = 2; // removing 3rd element
        list5.remove(n);
        System.out.println("5. After removing index " + n + ": " + list5);
    }
}
