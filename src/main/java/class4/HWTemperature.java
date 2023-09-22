package class4;

import java.util.Scanner;

public class HWTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your city? ");
        System.out.println("please enter the temperature in Fahrenheit? ");

        String name = scanner.next();
        double temp = scanner.nextDouble();

        double tempCon=0.5556;
        System.out.println("Your city is "+name+" and the temperature is " +tempCon * (temp-32)+ " celsius");


    }
}
