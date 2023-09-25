package class26;

import java.util.TreeMap;

/*
Creat a map Countries(5) with its capital that will store countries names will be keys and capitals will be values
    *print all keys and values from a country map using for each loop or Lambda.
    *print all value from a country map using for each loop or lambda
    *print all those country that has 5 letters and contain later a on the capital
 */
public class T2 {


    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Uganda", "Kampala");
        countries.put("Japan", "tokyo");
        countries.put("Usa", "Washington Dc");
        countries.put("France", "Paris");
        countries.put("Egypt", "Cairo");
        countries.forEach((k, v)->{
            if (k.length()>5|| v.contains("a")){
            System.out.println(k + " " + v);}

            });

    }
}