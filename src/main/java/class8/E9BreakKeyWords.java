package class8;

import java.util.Scanner;

public class E9BreakKeyWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double total=0;
        while (true){
            System.out.println("Please Enter the price of thr item");
            double price=scanner.nextDouble();
            if (price==-1){
                break;
            }else {
                total += price;
            }
            System.out.println("Your total bale is " +total);
        }

    }

}
