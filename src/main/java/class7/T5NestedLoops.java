package class7;

public class T5NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=15; j++) {
                if (i==1&&j==6||i==2&&j==5||i==2&&j==8||i==3&&j==4||i==3&&j==9||i==4&&j==2||i==4&&j==10) {
                    System.out.print(" ");
                }else {
                    System.out.print("#");
                }
            }
            System.out.println();


        }

    }
}
