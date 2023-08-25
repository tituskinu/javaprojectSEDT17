package review2;

import java.util.Scanner;

public class E5IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age =scanner.nextInt();
        if (age>=60){
            System.out.println("you get 20% discount");

        } else if (age>=50) {
            System.out.println("you get 15% discount");
        } else if (age>=40) {
            System.out.println("you get 10% discount");
        }else {
            System.out.println("no discount for you come after 10 years");
        }
    }
}
