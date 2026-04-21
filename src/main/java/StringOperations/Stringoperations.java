package StringOperations;
/*
Q2(a): Develop a Java program for performing various string operations:

1. String Creation and Basic Operations
2. Length and Character Access
3. String Comparison
4. String Searching
5. Substring Operations
6. String Modification
7. Whitespace Handling
8. String Concatenation
9. String Splitting
10. StringBuilder Demo
11. String Formatting
12. Validate Email using contains(), startsWith(), endsWith()
*/



public class Stringoperations {
    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. String Creation and Basic Operations
        // --------------------------------------------------
        String str = " Hello AIET ";
        System.out.println("Original String: '" + str + "'");

        // --------------------------------------------------
        // 2. Length and Character Access
        // --------------------------------------------------
        System.out.println("\n2. Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));

        // --------------------------------------------------
        // 3. String Comparison
        // --------------------------------------------------
        String str2 = "Hello AIET";
        System.out.println("\n3. Equals: " + str.equals(str2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // --------------------------------------------------
        // 4. String Searching
        // --------------------------------------------------
        System.out.println("\n4. Contains 'AIET': " + str.contains("AIET"));
        System.out.println("Index of 'AIET': " + str.indexOf("AIET"));

        // --------------------------------------------------
        // 5. Substring Operations
        // --------------------------------------------------
        System.out.println("\n5. Substring (1 to 6): " + str.substring(1, 6));

        // --------------------------------------------------
        // 6. String Modification
        // --------------------------------------------------
        String modified = str.replace("AIET", "College");
        System.out.println("\n6. After Replace: " + modified);

        // --------------------------------------------------
        // 7. Whitespace Handling
        // --------------------------------------------------
        System.out.println("\n7. Trimmed String: '" + str.trim() + "'");

        // --------------------------------------------------
        // 8. String Concatenation
        // --------------------------------------------------
        String concat = str.trim().concat(" Welcome");
        System.out.println("\n8. Concatenated String: " + concat);

        // --------------------------------------------------
        // 9. String Splitting
        // --------------------------------------------------
        String[] parts = str.trim().split(" ");
        System.out.println("\n9. Split Strings:");
        for(String p : parts) {
            System.out.println(p);
        }

        // --------------------------------------------------
        // 10. StringBuilder Demo
        // --------------------------------------------------
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("\n10. StringBuilder Output: " + sb);

        // --------------------------------------------------
        // 11. String Formatting
        // --------------------------------------------------
        System.out.printf("\n11. Formatted Output: %s %d\n", "Year", 2026);

        // --------------------------------------------------
        // 12. Email Validation
        // --------------------------------------------------
        String email = "student@gmail.com";

        boolean isValid = email.contains("@") &&
                          email.endsWith(".com") &&
                          !email.startsWith("@");

        System.out.println("\n12. Email: " + email);
        System.out.println("Is Valid Email? " + isValid);
    }
}
