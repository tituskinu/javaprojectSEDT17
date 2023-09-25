package class25;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class T11 {
    public static void main(String[] args) {
        List<String> countrys=new ArrayList<>();
        countrys.add("India");
        countrys.add("Japan");
        countrys.add("America");
        countrys.add("Afgan");
        countrys.add("Uganda");
        countrys.add("U.K");
        System.out.println(countrys);
        TreeSet<String> c=new TreeSet<>(countrys);
        System.out.println(c);

    }
}
