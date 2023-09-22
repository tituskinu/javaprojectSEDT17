package class24;

import java.util.ArrayList;
/*
Create an arrayList of fruits then remove all the fruits which contain letter a or ends with the letter e
 */
public class T6ArrayListLambda {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Kiwi");
        System.out.println(fruits);

        fruits.removeIf(x->x.endsWith("e")||x.endsWith("a"));
        System.out.println(fruits);

    }

}
