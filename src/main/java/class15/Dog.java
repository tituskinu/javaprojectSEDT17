package class15;

public class Dog {
   private String name;
   private String breed;
  private   String color;
   private int age;

   public Dog(String name, String breed, String color, int age){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }
   public Dog(String name, String breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
   public void bark(){
        System.out.println("wuff wuff.....");

    }
   public void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);
    }
}
