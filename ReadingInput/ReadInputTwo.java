import java.util.Scanner;

public class ReadInputTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(a);
        System.out.println(s);

        sc.close();
    }
}
