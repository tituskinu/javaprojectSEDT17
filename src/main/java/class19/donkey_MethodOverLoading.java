package class19;

public class donkey_MethodOverLoading {
    private String name;
    private String color;
    private int age;


    public donkey_MethodOverLoading(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;


    }
    public void printInfo(){
        System.out.println(name+ " "+color+ " "+age);
    }

}
class Dog extends donkey_MethodOverLoading{
    double weight;

    public Dog(String color, String name, int age, double weight) {
        super(color, name, age);
        this.weight=weight;
    }
  

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(weight);


    }
}