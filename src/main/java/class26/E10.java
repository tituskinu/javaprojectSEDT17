package class26;

import java.util.TreeMap;

public class E10 {
    public static void main(String[] args) {


        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 22.0);
        makeup.put("Concealer", 22.0);
        makeup.put("Eyeliner", 22.0);
        var entries=makeup.entrySet();
        for (var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

}
