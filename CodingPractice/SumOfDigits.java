package CodingPractice;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 5 Digit number : ");
        int number = sc.nextInt();
        int rem = 0;
        int sum = 0;

        while (number != 0) {
            rem = number % 10;
            sum += rem;
            number /= 10;
        }

        System.out.println("Sum of Digits of the Number is : " + sum);

        sc.close();
    }
}
