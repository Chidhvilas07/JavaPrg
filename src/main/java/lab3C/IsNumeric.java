package lab3C;

/*
Q3(c)(8): Write a Java Program to verify if a string contains 
only numeric characters using isNumeric().
*/

public class IsNumeric {

    public static void main(String[] args) {

        String str = "12345";

        System.out.println("Is Numeric: " + isNumeric(str));
    }

    public static boolean isNumeric(String s) {
        return s.matches("\\d+");
    }
}
