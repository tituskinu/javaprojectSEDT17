package GroupExercise;

public class Task3 {
    public static void main(String[] args) {
            /*
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int [][] arr= {{40, 25, 63, 10, 58},
                {10, 55, 23, 18, 50},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]%2==0) {
                    System.out.print(arr[i][j] + " ");
                }}
        }
    }

}
