package Strings;

public class StringsOne {

    public static void main(String[] args) {

        // String creation - Technique 01
        String s1 = new String("prabhu");
        System.out.println(s1);

        // String creation - Technique 02
        String s2 = "kalyan";
        System.out.println(s2);

        // Strings with same value refers to the same object in String constant pool
        // inside JVM
        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s3 == s4); // returns true, points to same address
    }
}
