package GroupExercise;

public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int[][] numbers = {
                {13,27,36,10},
                {98,53,17,28},
                {74,28,44,57}
        };
        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int[] number : numbers) {
            for (int i : number) {
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }
            }
        }
        System.out.println("The maximum number is " + max + " and the minimum number is " + min);
    }

}
