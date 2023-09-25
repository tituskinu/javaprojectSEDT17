package class26;
/*
Create a map of a building. Store floor number and its associated company name. (Example: 1=Google, 2=Synatx etc
Insert 7 entries with dublicate keys and values
    * chech how many entries you have?
    * Update company on a 4th floor
    * Remove company on the 7th floor
    * print your map
 */

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> TopFloor = new LinkedHashMap<>();
        TopFloor.put(1,"Google");
        TopFloor.put(2,"Syntax");
        TopFloor.put(3,"India");
        TopFloor.put(4,"India");
        TopFloor.put(5,"Chaina");
        TopFloor.put(6,"Syntax");
        TopFloor.put(7,"Google");
        System.out.println(TopFloor);
        System.out.println("Company size "+TopFloor.size());
        System.out.println("Company replace "+TopFloor.replace(5,"Apple"));
        System.out.println("Company remove "+TopFloor.remove(7));
        Set<Map.Entry<Integer, String>> entries = TopFloor.entrySet();
        for (Map.Entry<Integer, String> e : entries) {
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}
