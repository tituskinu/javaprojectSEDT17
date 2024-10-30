package class23;

import java.util.ArrayList;
import java.util.Scanner;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        String str=("Titus");
        arr.add(str);
        Integer i =new Integer(22);
        arr.add(i);
        Scanner s=new Scanner(System.in);
        arr.add(s);

        checkPrint(arr);
    }
    static void checkPrint(ArrayList aa){
        for (Object d:aa){
            String str=(String)d;

            System.out.println(str.length());

        }
    }
}
//NOTE: You will find an error if you run because you cannot convert Integers to String.
// that was the main idea for the Teacher