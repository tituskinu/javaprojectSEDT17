package class25;

import java.util.ArrayList;
import java.util.TreeSet;

public class cities {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
     Then remove any city that starts with “A”;*/
    public static void main(String[] args) {
        ArrayList<String> city=new ArrayList<>();
        city.add("Portland");
        city.add("Vegas");
        city.add("Miami");
        city.add("Seattle");
        city.add("Atlanta");
        System.out.println(city);
        TreeSet<String> c=new TreeSet<>(city);
        System.out.println(c);
        city.removeIf(x->x.toLowerCase().startsWith("a"));
        System.out.println(c);
    }
}
