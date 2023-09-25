package class26;



import java.util.ArrayList;

public class E7Maps {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //new Arraylist<>(); => Creating the object of the arraylist class
        names.add("Avis");
        names.add("Adam");
        names.add("John");
        names.add("James");

        ArrayList<ArrayList<String>> arrayLists= new ArrayList<>();
        arrayLists.add(names);
        names.add("Titus");
        System.out.println(names);
    }
}
