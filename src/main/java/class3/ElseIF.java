package class3;

public class ElseIF {
    public static void main(String[] args) {
        String fruit="Mango";
        switch (fruit) {
            case "Mango":
                System.out.println("Price is $15");
                break;
            case "Orange":
                System.out.println("Price is $4");

                break;
            case "Kiwi":
                System.out.println("Price is $1000");

                break;
            case "Apple":
                System.out.println("Price is $6");

                break;
            default:
                System.out.println("The Fruit is not available right now");
                break;
        }
    }
}
