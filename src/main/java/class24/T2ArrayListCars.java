package class24;

import java.util.ArrayList;

public class T2ArrayListCars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("V.W");
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Chevy");
        System.out.println(cars);
        for(String n:cars){
            System.out.println(n);
        }
    }


}
