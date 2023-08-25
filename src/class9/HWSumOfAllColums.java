package class9;

public class HWSumOfAllColums {
    public static void main(String[] args) {
        int [] []   num = {   {20,15,3},
                                {85,9,71},
                                {32,56,41},

                            };
        int sum=0;


        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                sum=sum+num[i][j];

            }

        }
        System.out.println(sum);

    }

}
