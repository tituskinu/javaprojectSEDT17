package review10;

public class AnimalTester {
    public static void main(String[] args) {
      /*  Animal animal=new Animal();
        animal.speak();
        animal.eat();
        Dog dog=new Dog();
        dog.speak();
        dog.eat();*/

        Animal [] arr ={new Cat(),new Dog()};
        for(Animal a :arr){
            a.eat();
            a.speak();
        }


       /* ChromeDriver c =new ChromeDriver();
        c.manage().window().maximize();
        c.get("http://www.amazone.com");
        c.getTitle();
        WebDriver []webDrivers={new ChromeDriver(),new EdgeDriver()};*/

    }
}
