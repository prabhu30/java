package CodingPractice;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to be reversed : ");
        int num = sc.nextInt();
        int reversedNum = 0;

        while (num != 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed Number : " + reversedNum);

        sc.close();
    }
}
