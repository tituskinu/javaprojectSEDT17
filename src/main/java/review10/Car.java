package review10;

public class Car implements washAble{
    public void drive(){
        System.out.println("driving.....");
    }

    @Override
    public void wash() {
        System.out.println("you can take a car to a carWash service");
    }
}
class Horse implements washAble{

    @Override
    public void wash() {
        System.out.println("Horse cna wash them selves ");
    }
}