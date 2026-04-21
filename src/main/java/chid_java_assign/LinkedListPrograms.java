package chid_java_assign;
/*
Q1(c): LinkedList Programs

1. Iterate through all elements starting from 2nd position using iterator
2. Iterate the linked list in reverse order
3. Insert element at the end using offerLast()
4. Display elements and their positions
5. Swap first and third elements using Collections.swap()
*/

import java.util.*;

public class LinkedListPrograms {
    public static void main(String[] args) {

        // Creating LinkedList with initial elements
        LinkedList<String> list = new LinkedList<>(
                Arrays.asList("Red", "Blue", "Green", "Yellow")
        );

        System.out.println("Original List: " + list);

        // --------------------------------------------------
        // 1. Iterate from 2nd position using iterator
        // --------------------------------------------------
        System.out.println("\n1. Iteration from 2nd position:");
        Iterator<String> it = list.listIterator(1); // index 1 = 2nd position
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // --------------------------------------------------
        // 2. Reverse iteration
        // --------------------------------------------------
        System.out.println("\n\n2. Reverse Iteration:");
        Iterator<String> rev = list.descendingIterator();
        while (rev.hasNext()) {
            System.out.print(rev.next() + " ");
        }

        // --------------------------------------------------
        // 3. Insert element at end
        // --------------------------------------------------
        list.offerLast("Pink");
        System.out.println("\n\n3. After inserting 'Pink' at end: " + list);

        // --------------------------------------------------
        // 4. Display elements with positions
        // --------------------------------------------------
        System.out.println("\n4. Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + " : " + list.get(i));
        }

        // --------------------------------------------------
        // 5. Swap first and third elements
        // --------------------------------------------------
        Collections.swap(list, 0, 2);
        System.out.println("\n5. After swapping 1st and 3rd elements: " + list);
    }
}