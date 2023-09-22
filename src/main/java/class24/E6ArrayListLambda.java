package class24;

import java.util.ArrayList;

public class E6ArrayListLambda {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Milk");
        drinks.add("Banana");
        drinks.add("Coffee");
        drinks.add("Table");
        drinks.add("T.V");
        System.out.println(drinks);
       /* for(String x:drinks){
            System.out.println(x);
        }
        drinks.forEach(x-> System.out.println(x));
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("e")){
                drinks.remove(i);
            }

        }*/

        drinks.removeIf(x->x.contains("e"));
        System.out.println(drinks);
    }


}
