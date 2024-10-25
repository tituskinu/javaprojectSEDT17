package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.next();
        if (name.equals("Titus")){
            System.out.println("Senior SDET in 2 years");
            
        }else if (name.equals("Alex")){
            System.out.println("I live in canada");
            
        } else if (name.equals("David")){
            System.out.println("jailed my wife");

            
        } else if (name.equals("James")) {
            System.out.println("Dental assistant");


        }else {
            System.out.println("Name does not exist");

        }

    }


}
