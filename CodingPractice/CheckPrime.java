package CodingPractice;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {

        // Check if a number is Prime or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int flag = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is not a Prime number");

        sc.close();
    }
}