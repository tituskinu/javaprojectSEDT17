package class5;

import java.util.Scanner;

public class birthMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your birth month");
        String month=scanner.next();

        if (month.equalsIgnoreCase("december")||
                (month.equalsIgnoreCase("january"))||
                (month.equalsIgnoreCase("february"))){
            System.out.println("its winter");
        } else if (month.equalsIgnoreCase("march")||
                (month.equalsIgnoreCase("april"))||
                (month.equalsIgnoreCase("may"))) {
            System.out.println("its spring");

        } else if (month.equalsIgnoreCase("june")||
                (month.equalsIgnoreCase("july"))||
                (month.equalsIgnoreCase("august"))) {
            System.out.println("its summer");

        } else if (month.equalsIgnoreCase("september")||
                (month.equalsIgnoreCase("october"))||
                (month.equalsIgnoreCase("november"))) {
            System.out.println("its autumn");

        }else {
            System.out.println("the month doest exist");
        }
    }
}
