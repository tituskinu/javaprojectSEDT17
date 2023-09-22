package GroupExercise;

public class Task1 {
    public static void main(String[] args) {
        /*
         Create a program that uses an array to store a list of temperatures for a week,
         and then uses a loop to find the highest and lowest temperature for the week.
         */
        int [] temp= {70, 60, 68, 74, 85, 90, 81};
        int highTemp = temp[0];
        int lowTemp = temp[1];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > highTemp) {
                highTemp = temp[i];
            }
            if (temp[i] < lowTemp) {
                lowTemp = temp[i];
            }
        }
        System.out.println("The highest temperature for the week is " + highTemp + "°F");
        System.out.println("The lowest temperature for the week is " + lowTemp + "°F");
    }
}
