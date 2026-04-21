package lab3B;

/*
Q3(b)(1): Write a Java Program to check if a given string is null 
or contains only whitespace using user defined function isNullOrEmpty().
*/

public class CheckNullOrEmpty {

    public static void main(String[] args) {

        String str = "   ";

        System.out.println("Is Null or Empty: " + isNullOrEmpty(str));
    }

    // Function to check null or empty
    public static boolean isNullOrEmpty(String s) {
        return (s == null || s.trim().isEmpty());
    }
}
