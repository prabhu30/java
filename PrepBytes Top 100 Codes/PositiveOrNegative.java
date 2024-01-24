import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num :");

        int num = sc.nextInt();
        String s = num >= 0 ? num == 0 ? "Zero" : "Positive" : "Negative";

        System.out.println(s);

        sc.close();
    }
}
