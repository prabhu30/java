import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // Check if a input year is leap or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        String result;

        // Technique 01 - If else
        if (year % 4 == 0)
            if (year % 100 == 0)
                if (year % 400 == 0)
                    result = "Leap Year";
                else
                    result = "Not a Leap Year";
            else
                result = "Leap Year";
        else
            result = "Not a Leap Year";
        System.out.println(year + " is " + result);

        sc.close();
    }
}
