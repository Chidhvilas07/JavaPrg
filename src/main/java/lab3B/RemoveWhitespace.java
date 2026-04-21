package lab3B;

/*
Q3(b)(5): Write a Java Program for eliminating all whitespace 
characters from a string using removeWhitespace().
*/

public class RemoveWhitespace {

    public static void main(String[] args) {

        String str = " Hello World ";

        System.out.println("Without Whitespace: " + removeWhitespace(str));
    }

    public static String removeWhitespace(String s) {
        return s.replaceAll("\\s", "");
    }
}
