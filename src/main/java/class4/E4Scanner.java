package class4;


import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();
        if(name.equals("Titus")){
            System.out.println("Java student");
        }else{
        System.out.println("I don't know you");
        }
    }
}
