package class9;

public class HW2OddEven {
    public static void main(String[] args) {
        int [] []   num = {   {20,15,3,7},
                                {85,9,71,55},
                                {32,56,41,91},
                                {5,17,22,37}

                            };


        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0){

            System.out.print(num[i][j] + "  ");
        }

            }
            System.out.println();


        }

    }

}
