package lab3C;

/*
Q3(c)(7): Write a Java Program for shortening a string to a 
specified length and adding ellipsis using truncate().
*/

public class TruncatString {
	  public static String truncate(String s, int len) {

	        if (s.length() > len) {
	            return s.substring(0, len) + "...";
	        }
	        return s;
	    }
    public static void main(String[] args) {

        String str = "Welcome to Java Programming";
        int length = 10;

        System.out.println("Truncated: " + truncate(str, length));
    }

  
}
