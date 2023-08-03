package class5;

public class Eswichstring {
    public static void main(String[] args) {
        String dog = "Titus";
        switch (dog){
            case "pomeranian":
                System.out.println("Small dog");
                break;
            case "great dane":
                System.out.println("Large dog");
                break;
            case "Titus":
                System.out.println("Human dog");
                break;
            default:
                System.out.println("the dog does not exist");




        }
    }
}
