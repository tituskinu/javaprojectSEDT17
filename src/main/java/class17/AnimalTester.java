package class17;

public class AnimalTester {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.name = "Tome";
        c.breed = "Russian";
        c.age = 13;
        c.color= "black";
        c.attitude=true;
        c.printInfo();
        c.miao();
        c.printName();


        Dog d = new Dog();
        d.name = "Titus";
        d.breed= "Ouch";
        d.age=40;
        d.color="yello";
        d.printInfo();
        d.back();
    }
}
