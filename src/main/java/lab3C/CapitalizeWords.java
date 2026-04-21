package lab3C;

/*
Q3(c)(6): Write a Java Program for capitalizing the first letter 
of each word using user defined function capitalizeWords().
*/

public class CapitalizeWords {

    public static void main(String[] args) {

        String str = "hello world from java";

        System.out.println("Capitalized: " + capitalizeWords(str));
    }

    public static String capitalizeWords(String s) {

        String[] words = s.split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        return result.trim();
    }
}
