package GroupExercise;

public class Task10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?
        String[] names = {"Rai", "Diana", "Arezo", "Sura", "Dua", "Rai", "Arezo"};

        for (int i = 0; i < names.length; i++) {
            String test= names[i];
            for (int j = i+1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate element is: " + names[j]);
                }

            }
        }
    }

}
