package lab3B;

/*
Q3(b)(2): Write a Java Program for counting how many times a substring 
appears in a main string using countOccurrences().
*/

public class CountOccurences {

    public static void main(String[] args) {

        String mainStr = "banana";
        String subStr = "an";

        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }

    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}