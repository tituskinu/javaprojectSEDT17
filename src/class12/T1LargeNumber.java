package class12;

import java.util.Scanner;

public class T1LargeNumber {
    void large() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Please Enter the second number");
        int num2=scanner.nextInt();
        if (num1>num2){
            System.out.println("The first number is greater than the second number ");
        }else {
            System.out.println("The second number is greater than the first number ");
        }
}

}
