import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {

        // Sum of First N natural numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;

        // Technique 01 - for Loop
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        System.out.println("[For Loop] Sum of first " + n + " natural numbers : " + sum1);

        // Technique 02 - Formula
        sum2 = n * (n + 1) / 2;
        System.out.println("[Formula] Sum of first " + n + " natural numbers : " + sum2);

        // Technique 03 - Recursion
        sum3 = sumOfN(n);
        System.out.println("[Recursion] Sum of first " + n + " natural numbers : " + sum3);
        System.out.println();

        sc.close();
    }

    public static int sumOfN(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumOfN(number - 1);
    }
}