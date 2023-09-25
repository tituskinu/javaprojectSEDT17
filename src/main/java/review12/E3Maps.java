
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
        Map<String,Double> studentMarksMap=new HashMap<>();
        studentMarksMap.put("Habib",95.5);
        studentMarksMap.put("Titus",95.8);
        studentMarksMap.put("Madina",90.8);
        studentMarksMap.put("Aurther",65.8);
        studentMarksMap.put("Nelson",85.8);
        System.out.println(studentMarksMap);


        LinkedHashMap<String,Double> studentMarksMap1=new LinkedHashMap<>();
        studentMarksMap1.put("Habib",95.5);
        studentMarksMap1.put("Titus",95.8);
        studentMarksMap1.put("Madina",90.8);
        studentMarksMap1.put("Aurther",65.8);
        studentMarksMap1.put("Nelson",85.8);
        System.out.println(studentMarksMap1);
        TreeMap<String,Double> studentMarksMap2=new TreeMap<>();
        studentMarksMap2.put("Habib",95.5);
        studentMarksMap2.put("Titus",95.8);
        studentMarksMap2.put("Madina",90.8);
        studentMarksMap2.put("Aurther",65.8);
        studentMarksMap2.put("Nelson",85.8);
        System.out.println(studentMarksMap2);
    }
}
