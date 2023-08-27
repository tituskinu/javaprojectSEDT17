package class12;

import java.util.Scanner;

public class E2Calculator {

    void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("The sum of your numbers is "+sum);

    }





    void  subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please Enter the second number");
        int num2 = scanner.nextInt();
        int sum = num1 - num2;
        System.out.println("Subruct of those number is " + sum);
    }



        void multiply(int number1,int number2){
           // int number1=10;
            //int number2=20;
            int result=number1*number2;
            System.out.println("The multiplication of two number are "+result);
        }

}
