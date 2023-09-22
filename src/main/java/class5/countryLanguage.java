package class5;

import java.util.Scanner;

public class countryLanguage {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a country");
        String country = scanner.next();
        country=country.toLowerCase();

        switch (country) {
            case "kenya":
                System.out.println("Swahili");
                break;
            case "us":
                System.out.println("english");
                break;
            case "spain":
                System.out.println("spanish");
                break;
            default:
                System.out.println("country not found");


        }

    }

}
