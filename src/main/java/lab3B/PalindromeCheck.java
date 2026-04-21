package lab3B;

/*
Q3(b)(4): Write a Java Program to check if a string is palindrome 
(ignoring case and punctuation).
*/

public class PalindromeCheck {

    public static void main(String[] args) {

        String str = "Madam";

        System.out.println("Is Palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {

        // Remove non-letters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
