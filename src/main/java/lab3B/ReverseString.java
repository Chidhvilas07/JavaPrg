package lab3B;

/*
Q3(b)(3): Write a Java Program for reversing the characters 
in a string using reverseString().
*/

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello";

        System.out.println("Reversed String: " + reverseString(str));
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
