package class21;



public abstract class Animal{
    abstract void speak();

    abstract void sleep();
    abstract void eat();

   /* public  void printInfo(){
        System.out.println(name+" "+breed+" "+color);
    }*/
}
class Dod extends Animal {
    @Override
    void speak() {
        System.out.println("wuff wuff .....");
    }

    void sleep(){
        System.out.println("muff muff .....");
    }

    void eat(){
        System.out.println("Eating bones.....");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Animals ");
    }
    void sleep(){
        System.out.println("Animal Sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }

}