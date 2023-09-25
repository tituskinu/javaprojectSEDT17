package class26;

import java.util.TreeMap;

public class T3 {
    /*
    Creat am map of Best Buy store. Place items id and item name into it.Example (7664847=Printer, 7879885=TV etc)
    * Retrieve all keys and values from a Best
     */
    public static void main(String[] args) {
        TreeMap<String,String> countries= new TreeMap<>();
        countries.put("Canada","Ottawa");
        countries.put("USA","Washington DC");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");
        countries.put("Egypt","Cairo");

        countries.forEach((k,v)->{
            if(k.length()>5 && v.contains("a")){
                System.out.println(k+" "+v);}
        });
    }

}
