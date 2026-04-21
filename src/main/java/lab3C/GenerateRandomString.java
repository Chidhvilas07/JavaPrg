package lab3C;

/*
Q3(c)(9): Write a Java Program for creating a random string 
of a specified length using generateRandomString().
*/

import java.util.Random;

public class GenerateRandomString {

    public static void main(String[] args) {

        System.out.println("Random String: " + generateRandomString(6));
    }

    public static String generateRandomString(int len) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < len; i++) {
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }

        return sb.toString();
    }
}
