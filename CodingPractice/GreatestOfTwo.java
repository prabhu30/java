package CodingPractice;

import java.util.Scanner;

public class GreatestOfTwo {

    public static void main(String[] args) {

        // Greatest of Two Numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        // Technique 01 - Using if else
        if (num1 > num2)
            System.out.println(num1 + " is greatest of the two.");
        else
            System.out.println(num2 + " is greatest of the two.");

        // Technique 02 - Ternary Operator
        int result = 0;
        result = num1 > num2 ? num1 : num2;
        System.out.println(result + " is greatest of the two.");

        // Technique 03 - Math.max method
        result = Math.max(num1, num2);
        System.out.println(result + " is greatest of the two.");

        sc.close();
    }
}
