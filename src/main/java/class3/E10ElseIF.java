package class3;

public class E10ElseIF {
    public static void main(String[] args) {
        String fruit="Kiwi";
        if (fruit.equals("Mango")) {
            System.out.println("Price is $15");
        } else if (fruit.equals("Orange")) {
            System.out.println("Price is $4");
        } else if (fruit.equals("Kiwi")) {
            System.out.println("Price is $1000");
        } else if (fruit.equals("Apple")) {
            System.out.println("Price is $6");
        } else {
            System.out.println("The Fruit is not available right now");
        }
    }
}
