package Concepts;

enum ServerStatus {
    Success, Failure, Pending, Running;
}

public class Enum {
    public static void main(String[] args) {

        // Get a single value from Enum
        ServerStatus s1 = ServerStatus.Success;
        System.out.println(s1);

        // Get index of value inside enum
        ServerStatus s2 = ServerStatus.Pending;
        System.out.println(s2.ordinal());

        // Get all values from enum
        ServerStatus s3[] = ServerStatus.values();
        for(ServerStatus s : s3) {
            System.out.println(s.ordinal() + " : " + s);
        }
    }
}
