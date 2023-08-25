package class9;

public class TwoDArray {
    public static void main(String[] args) {
        String [] []   cars = {   {"Camero","Corvette","Silverado","Titus"},
                                {"Mustung","Ranger","F-150","Mwaura"},
                                {"Ferrari","Lambo","Tesla","Kinuthia"},
                                //{"Titus","Mwaura","Kinuthia"}

                            };


        for (int i = 0; i < cars.length; i++) {

            for (int j = 0; j < cars[i].length; j++) {

                    System.out.print(cars[i][j]+ "  ");

            }
            System.out.println();


        }

    }

}
