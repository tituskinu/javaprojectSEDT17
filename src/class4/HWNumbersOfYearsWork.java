package class4;

import java.util.Scanner;

public class HWNumbersOfYearsWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers of work years");
        int years=scanner.nextInt();
        if (years>=5){
            System.out.println("you are eligible for boners");
            System.out.println("what is your salary");
            Scanner scanner1=new Scanner(System.in);
            int salary=scanner.nextInt();
            if (salary>=50000){
                System.out.println("you are eligible for 5000 bonus");
            } else if (salary<=49999) {
                System.out.println("you are eligible for 3000 bonus");

            }
        }else {
            System.out.println("You are not eligible for bonus ");
        }
    }
}
