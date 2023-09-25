package review12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E2Sets {
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(60);
        numbers.add(40);
        numbers.add(100);
        numbers.add(10);
        System.out.println(numbers);


        ArrayList<Integer> number=new ArrayList<>();
        number.add(20);
        number.add(10);
        number.add(60);
        number.add(40);
        number.add(100);
        number.add(10);
        System.out.println(number);

        LinkedHashSet<Integer> num=new LinkedHashSet<>(number);
        /*System.out.println(num);
        number=new ArrayList<>(num);
        System.out.println(number);*/
        number.clear();
        number.addAll(num);
        System.out.println(number);
    }
}
