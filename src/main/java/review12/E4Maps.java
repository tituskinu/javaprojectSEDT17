package review12;

import java.util.HashMap;
import java.util.Map;

public class E4Maps {
    public static void main(String[] args) {
        Map<String,Double> studentMarksMap=new HashMap<>();
        studentMarksMap.put("Habib",95.5);
        studentMarksMap.put("Titus",95.8);
        studentMarksMap.put("Madina",90.8);
        studentMarksMap.put("Aurther",65.8);
        studentMarksMap.put("Nelson",85.8);
        System.out.println(studentMarksMap);
        //studentMarksMap.forEach((k,v)->System.out.println(k+" "+v));
        final int[] counter=new int[1];
        studentMarksMap.forEach((k,v)->{
            int c=0;
            if (k.contains("a")|| v>96){
                System.out.println(k+" "+v);
                counter[0]++;
            }
        });
        System.out.println(counter[0]);
    }
}
