import java.util.Scanner;

public class PrimesInRange {

    public static void main(String[] args) {

        // Print all prime numbers in a given range (Inclusive)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower range : ");
        int lowerRange = sc.nextInt();
        System.out.println("Enter upper range : ");
        int upperRange = sc.nextInt();

        if (lowerRange < 0 || upperRange < 0) {
            System.out.println("Invalid Inputs. Enter Positive Numbers only.");
        } else {
            for (int i = lowerRange; i <= upperRange; i++) {
                int flag = 1;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }

                if (i != 0 && i != 1 && flag == 1) {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}
