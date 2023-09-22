package class19;

public class T6CreditCard {


    public void callInt(double balance ){
        System.out.println(balance*0.05);

    }

}
class visa extends T6CreditCard {

}
class AX extends T6CreditCard {
    @Override
    public void callInt(double balance) {
        super.callInt(balance*0.07);
    }
}