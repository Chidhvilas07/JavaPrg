package lab3C;

/*
Q3(c)(10): Write a Java Program for counting the number 
of words in a string using countWords().
*/

public class CountWords {

    public static void main(String[] args) {

        String str = "Java is easy to learn";

        System.out.println("Word Count: " + countWords(str));
    }

    public static int countWords(String s) {

        if (s.trim().isEmpty()) return 0;

        return s.trim().split("\\s+").length;
    }
}
