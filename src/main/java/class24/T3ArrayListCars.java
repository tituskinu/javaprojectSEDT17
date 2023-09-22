package class24;

import java.util.ArrayList;

public class T3ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Beer");
        drinks.add("Mango");
        drinks.add("Tea");
        drinks.add("Coffee");
        System.out.println(drinks);

        for (int i = 0; i <drinks.size() ; i++) {
            String drink=drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"water");
            }

        }

        System.out.println(drinks);
    }


}
