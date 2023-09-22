package class20;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    public void mySpeed(){
        System.out.println("100km/s");
    }
    public void space(){
        System.out.println("1T");
    }

}
class Apple extends Computer{
    public void mySpeed(){
        System.out.println("50km/s");
    }
    public void space(){
        System.out.println("2T");
    }
    public void owner(){
        System.out.println("Apple");
    }

}
class Lenovo extends  Computer{
    public void mySpeed(){
        System.out.println("900km/s");
    }
    public void space(){
        System.out.println("5T");
    }
    public void owner(){
        System.out.println("lenovo");
    }

}
class Hp extends Computer{
    public void mySpeed(){
        System.out.println("200km/s");
    }
    public void space(){
        System.out.println("5T");
    }
    public void owner(){
        System.out.println("HP");
    }

}
class Dell extends Computer{
    public void mySpeed(){
        System.out.println("500km/s");
    }
    public void space(){
        System.out.println("100T");
    }
    public void wight(){
        System.out.println("20lb");
    }

}