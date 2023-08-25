package ChatGBT;

import java.util.Scanner;

public class displayNamePhoneNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your mobile number (xxx-xxx-xxxx format): ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Your name is " + name + ", your age is " + age + ", and your mobile number is " + mobileNumber);

        scanner.close();



    }
}