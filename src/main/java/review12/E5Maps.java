package review12;

import java.util.HashMap;
import java.util.Map;

public class E5Maps {
    public static void main(String[] args) {
        Map<String,Double> studentMarksMap=new HashMap<>();
        studentMarksMap.put("Habib",95.5);
        studentMarksMap.put("Titus",95.8);
        studentMarksMap.put("Madina",90.8);
        studentMarksMap.put("Aurther",65.8);
        studentMarksMap.put("Nelson",85.8);
        System.out.println(studentMarksMap);
      // Set<Entry<String,Double>> entrySet=studentMarksMap.entrySet();
        var entrySet=studentMarksMap.entrySet();
        entrySet.removeIf(x->x.getKey().contains("e")||x.getValue()<90);
        System.out.println(studentMarksMap);

    }
}
