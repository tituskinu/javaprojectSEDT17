package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Ace");
        arr.add("Titus");
        arr.add("Kinuthia");
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("Titus"));
        System.out.println(arr.indexOf("Titus"));
    }
}
