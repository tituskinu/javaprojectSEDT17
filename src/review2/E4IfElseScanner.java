package review2;

import java.util.Scanner;

public class E4IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the price of the item");
        double price=scanner.nextDouble();
        if(price>1000) {
            System.out.println("i cant buy this item ");
        }else {
            System.out.println("lets buy it");
        }
    }
}
