package chid_java_assign;

/*
Q1(a): Develop a Java program for adding elements [Apple, Banana, Orange]
into an ArrayList and a LinkedList and perform the following operations:
1. Adding elements
2. Adding element at specific index
3. Adding multiple elements
4. Accessing elements
5. Updating elements
6. Removing elements
7. Searching elements
8. List size
9. Iterating over list
10. Using Iterator
11. Sorting
12. Sublist
13. Clearing the list
*/

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {

        // Creating ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("===== ARRAY LIST OPERATIONS =====");
        performOperations(arrayList);

        System.out.println("\n===== LINKED LIST OPERATIONS =====");
        performOperations(linkedList);
    }

    // Generic function to perform operations on both lists
    public static void performOperations(List<String> list) {

        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 2. Add element at specific index
        list.add(1, "Mango");

        // 3. Add multiple elements
        list.addAll(Arrays.asList("Grapes", "Pineapple"));

        // 4. Access element
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Update element
        list.set(0, "Kiwi");

        // 6. Remove element
        list.remove("Banana");

        // 7. Search element
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // 8. List size
        System.out.println("List Size: " + list.size());

        // 9. Iterating using for-each
        System.out.print("For-each loop: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 12. Sublist
        System.out.println("Sublist (0 to 2): " + list.subList(0, 2));

        // 13. Clearing list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
