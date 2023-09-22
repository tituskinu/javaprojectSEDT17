package class9;

public class HW4Grocery {
    public static void main(String[] args) {       String [] []   grocery = {   {"onions","Banana","Potato"},
                                {"Orange","apple","eggs"},
                                {"Oil","Milk","greens"},
                                {"Carrots","Kiwi","Watermelon"}

                            };


        for (int i = 0; i < grocery.length; i++) {

            for (int j = 0; j < grocery[i].length; j++) {

                    System.out.print(grocery[i][j]+ "  ");

            }
            System.out.println();


        }

    }

}
