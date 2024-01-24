import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {

        // Greatest of Three numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number : ");
        int num3 = sc.nextInt();

        int result = 0;

        // Technique 01 - if else if
        if (num1 > num2 && num1 > num3)
            result = num1;
        else if (num2 > num3)
            result = num2;
        else
            result = num3;
        System.out.println(result + " is greatest of three.");

        // Technique 02 - Ternary operator
        result = num1 > num2 && num1 > num3 ? num1 : num2 > num3 ? num2 : num3;
        System.out.println(result + " is greatest of three.");

        // Technique 03 - In-built max method
        result = Math.max(Math.max(num1, num2), num3);
        System.out.println(result + " is greatest of three.");

        sc.close();
    }
}
