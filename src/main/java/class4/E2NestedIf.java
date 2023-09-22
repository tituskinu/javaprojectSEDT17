package class4;

public class E2NestedIf {
    public static void main(String[] args) {
        boolean winter = true;
        String jacketColor = "yellow";
        if (winter == true) {
            System.out.println("its very cold");
            if (jacketColor.equals("red")) {
                System.out.println("Lets go with the red nicky shoes");
            }else{

                System.out.println("lets go with the blue ones ");
            }
        } else {
            System.out.println("No need to wear jackets");
        }
    }

}
