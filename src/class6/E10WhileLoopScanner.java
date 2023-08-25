package class6;

import java.util.Scanner;

public class E10WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the starting point");
        int start=scanner.nextInt();
        System.out.println("please enter the end point");
        int end=scanner.nextInt();
        System.out.println("please enter the step as well");
        int step=scanner.nextInt();
        while (start<=end){
            System.out.print(start+" ");
            start+=step;
        }
    }
}
