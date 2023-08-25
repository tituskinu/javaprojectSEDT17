package class9;

public class HW1Countries {
    public static void main(String[] args) {
        String [] []   countries = {   {"Usa","Mexico","Canada"},
                                {"Germany","Italy","UK"},
                                {"Uganda","Nigeria","Ghana"},
                                {"Chille","nicaragua","Brazil"}

                            };


        for (int i = 0; i < countries.length; i++) {

            for (int j = 0; j < countries[i].length; j++) {

                    System.out.print(countries[i][j]+ "  ");

            }
            System.out.println();


        }

    }

}
