package class7;

public class T1NestedLoops {
    public static void main(String[] args) {

        int y=1;
        while (y<=4){
            int x=1;
            while (x<7){
                if(x!=3){
                    System.out.print(x + " ");
                }
                x++;
            }
            System.out.println();
            y++;

        }

    }
}
