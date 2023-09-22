package class20;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arr={new Apple(), new Lenovo(),new Hp(), new Dell()};
        for(Computer a:arr){
            a.mySpeed();
            a.space();
            a.space();
        }
    }
}
