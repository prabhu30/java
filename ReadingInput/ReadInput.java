import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadInput {
    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num = 0;
        System.out.println("Enter a number :");

        try {
            num = Integer.parseInt(br.readLine());
            System.out.println("Input from user is : " + num);
        } catch (Exception e) {
            System.out.println("Could not read Input from the User.");
            System.err.println("Error " + e);
        }

    }
}