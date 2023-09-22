package review10;

public abstract class Animal {
    abstract void speak();
    abstract void eat();

}
class Dog extends Animal{
    void speak(){
        System.out.println("Wuff Wuff");
    }
    void eat(){
        System.out.println("Dog eat bones");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Mweo Mweo");
    }
    void eat(){
        System.out.println("Cats like to eat fresh Fish");
    }
}