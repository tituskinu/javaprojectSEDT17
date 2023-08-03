package class4;

import java.util.Scanner;

public class HWCreditCard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String name=scanner.next();

        if (name.equals("no")){
            System.out.println("i will offer you a credit card");
        }

        if (name.equals("yes")){
            System.out.println("what is the balance of your card");
            Scanner scanner1=new Scanner(System.in);
            double balance=scanner.nextDouble();

            if (balance>1000){
                System.out.println("pay your card off immediately");
            }else {
                System.out.println("you can spend more");
            }
        }







    }
}
