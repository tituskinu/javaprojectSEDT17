package class24;

import java.util.ArrayList;
/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */

public class T1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(100);
        numbers.add(5);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(20));
        System.out.println(numbers.size());
    }
}
