package class16;

public class CatTest {
    public static void main(String[] args) {
        Cat c1=new Cat("Titus","tito","black",5);
        c1.printInfo();

        Cat c2=new Cat();
        c2.printInfo();

        Cat c3=new Cat("irene","kamau","white",42,'M');
        c3.printInfo();

        Cat c4=new Cat("kananu","irene","yello",89,'M');
        c4.printInfo();
    }


}
