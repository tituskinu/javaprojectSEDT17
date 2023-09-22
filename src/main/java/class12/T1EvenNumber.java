package class12;

import java.util.Scanner;

public class T1EvenNumber {
    void isEven() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=scanner.nextInt();
        if (num1%2==0){
            System.out.println("Its Even number ");
        }else {
            System.out.println("Its an odd number ");
        }
}

}
