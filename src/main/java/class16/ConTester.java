package class16;

public class ConTester {
    private ConTester(){
        System.out.println("Private");

    }
    ConTester(String name){
        System.out.println("Default");

    }
    protected ConTester(int age){
        System.out.println("Protected");

    }
    public ConTester(double weight){
        System.out.println("Public");

    }



    public static void main(String[] args) {
        new ConTester();
        new ConTester("Titus");
        new ConTester(35);
        new ConTester(120);

    }
}
