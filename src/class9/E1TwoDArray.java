package class9;

public class E1TwoDArray {
    public static void main(String[] args) {
        String [] []   names = {   {"Hind","Mikhail","Ismael","Ahamed"},
                                   {"John","Bob","Adam","Tamim"},
                                   {"Joka","Laugh","John Ahmed","Mohammad"},
                                   {"Gui","Backend","Front","API"}

                            };
       String[] row=names[2];
        System.out.println(row[3]);
        System.out.println("________________________");
        for(String [] rowi:names){
            for(String n:rowi) {
                System.out.print(n+"   ");
            }
            System.out.println();
        }

    }


}
