package review3;

import java.util.Scanner;

public class E5Switch {
    public static void main(String[] args) {
        for (int i = 3; i <=3 ; i++) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name of the fruit");
            String fruit = scanner.next();
            switch (fruit) {
                case "orange":
                    System.out.println("its usually orange");
                    break;
                case "banana":
                    System.out.println("yellow bannana are good");
                    break;
                case "strawberry":
                    System.out.println("i like red strawberries");
                    break;
                case "blue berry":
                    System.out.println("blue berry are good for your heart");
                    break;
                default:
                    System.out.println("i dont like this fruit");
            }
        }
    }
}
