package GroupExercise;

public class Task9 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?

        int[][] numbers = {
                {13,27,36,10},
                {98,53,17,28},
                {74,28,44,57}
        };
        int largest = numbers[0][0];
        int secondLargest = numbers[0][0];

        for (int[] number : numbers) {
            for (int i : number) {
                if (i > secondLargest) {
                    secondLargest = i;
                }
                if (i > largest) {
                    secondLargest=largest;
                    largest= i;
                }
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }

}
