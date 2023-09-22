package class22;

public interface  MoveAble {
    public abstract void move();

}

interface Washable{
    void wash();
}
class  Dog implements MoveAble,Washable{
    public void move(){
        System.out.println("Dogs can jump run and can move");
    }


    @Override
    public void wash() {
        System.out.println("you can safely wash the Dog");
    }
}
class Car implements MoveAble,Washable{
    public void move(){
        System.out.println("Dogs can jump run and move");
    }


    @Override
    public void wash() {
        System.out.println("you can safely wash the Dog");
    }
}