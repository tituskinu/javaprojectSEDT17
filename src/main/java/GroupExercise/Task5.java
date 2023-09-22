package GroupExercise;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable?
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");

        int a= scan.nextInt();
        int b= scan.nextInt();
        int[] arr={a,b};
        a=arr[1];
        b=arr[0];

        System.out.println(a+ " " + b);
    }

}
