package class25;

import java.util.HashSet;

public class E7Sets {
    //Sets
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
        System.out.println("*************************************************");
        fruit.forEach(x-> System.out.println(x));
        System.out.println("************************************************");

        for (String f:fruit){
            System.out.println(f);
        }



    }
}
