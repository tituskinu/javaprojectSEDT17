package class5;

import java.util.Scanner;

public class whether {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the day");
        int day=scanner.nextInt();
        if (day>=6 && day<=7){
            System.out.println("its a weekday");
        } else if (day>=1 && day<=5) {
            System.out.println("its weekday");

        }else {
            System.out.println("day doen't exist");
        }
    }
}
