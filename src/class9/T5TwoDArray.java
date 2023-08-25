package class9;

public class T5TwoDArray {
    public static void main(String[] args) {
        String [] []   cars = {   {"Camero","Corvette","Silverado","Dodge"},
                                {"Mustung","Ranger","F-150","Volkwagen"},
                                {"Ferrari","Lambo","Tesla","Pronto"},
                                {"Titus","Mwaura","Kinuthia","ouch"}

                            };


        for (String [] gari:cars) {
            for (String d:gari) {

                    System.out.print(d+ "  ");

            }
            System.out.println();


        }

    }

}
