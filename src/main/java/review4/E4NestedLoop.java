package review4;

public class E4NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <i; j++) {
                    System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 4; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
