package review2;

public class E7NestedIf {
    public static void main(String[] args) {
       // Scanner scanner=new Scanner(System.in);
        //System.out.println("enter the day");
        String day ="Sunday";
        double accountBalance=5000;
        if (day.equals("Sunday")){
            System.out.println("you can go shopping");
            if (accountBalance>2000){
                System.out.println("we can buy");
            }else {
                System.out.println("its too expensive");
            }

        } else if (day.equals("Saturday")) {
            System.out.println("Its saturday lets go dinner");

        } else if (day.equals("Monday")) {
            System.out.println("its monday day for prayer");

        } else {
            System.out.println("the day is not sunday");
        }
    }
}
