package GroupExercise;

public class Task4 {
    public static void main(String[] args) {

          /*
        Create a 2D array of integers. Develop a program which will
        calculate the sum of even and odd numbers for that array.
         */
        int [][] numbers= {{40, 25, 63, 10, 58},
                {10, 55, 23, 18, 50},
                {5, 15, 20, 10, 35},
        };
        int sum = 0;

        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col ++){
                sum = sum + numbers[row][col];
            }
        }
        System.out.println(sum);
    }

}
