package class9;

import java.util.Arrays;

public class E9TwoDArray {
    public static void main(String[] args) {
        String [] []   names = {   {"Hind","Mikhail","Ismael","Ahamed"},
                                   {"John","Bob","Adam","Tamim"},
                                   {"Joka","Laugh","John Ahmed","Mohammad"},
                                   {"Gui","Backend","Front","API"}

                            };
       for (String [] words : names){
           for (String v:words) {
               System.out.print(v+"   ");
           }
           System.out.println();
        }
        System.out.print(Arrays.deepToString(names));//for printing 2D arrays

    }


}
