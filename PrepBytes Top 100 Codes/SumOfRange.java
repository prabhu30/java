import java.util.Scanner;

public class SumOfRange {

    public static void main(String[] args) {

        // Sum of Numbers in the Given Range

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower range : ");
        int lowerRange = sc.nextInt();
        System.out.println("Enter upper range : ");
        int upperRange = sc.nextInt();

        int sum1 = 0, sum2 = 0, sum3 = 0;

        // Technique 01 - For Loop
        for (int i = lowerRange; i <= upperRange; i++) {
            sum1 += i;
        }
        System.out.println("[For Loop] Sum of numbers from " + lowerRange + " to " + upperRange + " : " + sum1);

        // Technique 02 - Formula
        sum2 = (upperRange * (upperRange + 1) / 2) - (lowerRange * (lowerRange + 1) / 2) + lowerRange;
        System.out.println("[Formula] Sum of numbers from " + lowerRange + " to " + upperRange + " : " + sum2);

        // Technique 03 - Recursion
        sum3 = sumOfRange(lowerRange, upperRange);
        System.out.println("[Recursion] Sum of numbers from " + lowerRange + " to " + upperRange + " : " + sum3);

        sc.close();
    }

    public static int sumOfRange(int lowerRange, int upperRange) {
        if (upperRange == lowerRange)
            return lowerRange;
        return upperRange + sumOfRange(lowerRange, upperRange - 1);
    }
}
