package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(); // you wil be able to add any data in theis kind of ArrayList
        arr.add("Ace");
        arr.add("Titus");
        arr.add("Kinuthia");
        arr.add("Ouch");
        System.out.println(arr);
        System.out.println(arr.clone());
        System.out.println(arr.get(1));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("Ouch"));
        System.out.println(arr.indexOf("Titus"));
        System.out.println(arr.indexOf("Ouch"));
    }
}
