package class6;

import java.util.Scanner;

public class E10DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int input;
        System.out.println("Please enter your number or shutdown or -1 to terminate");
        input=scanner.nextInt();
        System.out.println("you are great "+input);
       // if (input != -1) {
            do {
                System.out.println("Please enter your number or shutdown or -1 to terminate");
                input = scanner.nextInt();
                System.out.println("you are great " + input);
            } while (input != -1);
       // }
    }
}
