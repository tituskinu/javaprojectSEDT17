package GroupExercise;

public class Task2 {
    public static void main(String[] args) {
            /*
        Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */

        int numbers []= {10, 20, 30, 40, 50};
        int sum=0;
        for (int i:numbers){
            sum+=i;

        }
        System.out.println(sum);


    }

}
