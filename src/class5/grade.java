package class5;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the grade letter");
        String grade=scanner.next();
        grade=grade.toLowerCase();
        switch (grade){
            case "a":
                System.out.println("exelent");
                break;
            case "b":
                System.out.println("very good");
                break;
            case "c":
                System.out.println("good");
                break;
            case "d":
                System.out.println("need work");
                break;
            case "e":
                System.out.println("need to start over");
                break;
            default:
                System.out.println("grade latter does not exist");
        }
    }
}
