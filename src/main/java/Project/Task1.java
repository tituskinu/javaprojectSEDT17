package Project;
/*
Write a program to swap 2 String without a temporary variable
 */
public class Task1 {
    public static void main(String[] args) {
        String str1 = "Money";
        String str2 = "Java";

        System.out.println("Before swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
