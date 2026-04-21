package StringOperations;
/*
Q2(b): Develop a Java program to perform a performance test on 
StringBuffer and StringBuilder for appending the string 'AIET' 
10000 times. Justify which one is better.
*/

public class PerformanceTest {
    public static void main(String[] args) {

        // --------------------------------------------------
        // StringBuffer Performance Test
        // --------------------------------------------------
        long startTime1 = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < 10000; i++) {
            sbf.append("AIET");
        }

        long endTime1 = System.currentTimeMillis();

        System.out.println("StringBuffer Time: " + (endTime1 - startTime1) + " ms");

        // --------------------------------------------------
        // StringBuilder Performance Test
        // --------------------------------------------------
        long startTime2 = System.currentTimeMillis();

        StringBuilder sbd = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sbd.append("AIET");
        }

        long endTime2 = System.currentTimeMillis();

        System.out.println("StringBuilder Time: " + (endTime2 - startTime2) + " ms");

        // --------------------------------------------------
        // Conclusion
        // --------------------------------------------------
        if ((endTime1 - startTime1) > (endTime2 - startTime2)) {
            System.out.println("\nConclusion: StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("\nConclusion: StringBuffer is faster than StringBuilder.");
        }
    }
}
