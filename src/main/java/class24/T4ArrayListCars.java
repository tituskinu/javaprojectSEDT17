package class24;

import java.util.ArrayList;

public class T4ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Milk");
        drinks.add("Banana");
        drinks.add("Coffee");
        drinks.add("Table");
        drinks.add("T.V");
        System.out.println(drinks);
        /*for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).endsWith("e")){
                drinks.remove(i);
                i--;
            }

        }*/
      /*  drinks.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            } else {return false;
            });*/
        drinks.removeIf(x->x.endsWith("e"));
        System.out.println(drinks);
    }


}
