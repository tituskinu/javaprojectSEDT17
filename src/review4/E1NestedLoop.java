package review4;

public class E1NestedLoop{
    public static void main(String[] args) {
        for (int h = 0; h <24 ; h++) {

            for (int j = 0; j < 60; j++) {
                for (int i = 0; i < 60; i++) {
                    if (i < 10 && j < 10) {
                        System.out.println(h+":0" + j + " :0" + i);
                    } else if (i >= 10 && j > 10) {
                        System.out.println(h+":0" + j + ":0" + i);
                    } else {
                        System.out.println(h+":0"+j + ":0" + i);
                    }

                }

            }
        }

    }
}
