import java.util.Scanner;

public class ReadSpaceSeparatedInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Length of Array
        System.out.println("Enter length of Array : ");
        int n = sc.nextInt();
        int ele;
        int arr[] = new int[n];

        // Read those "n" numbers;
        System.out.println("Enter elements of the Array : ");
        for (int i = 0; i < n; i++) {
            ele = sc.nextInt();
            arr[i] = ele;
        }

        // Print the array
        System.out.println("Elements of Array are : ");
        for (int i : arr) {
            System.out.println(i);
        }

        sc.close();
    }
}
