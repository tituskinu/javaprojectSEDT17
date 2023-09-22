package review10;

public interface washAble {
    void wash();

}
class  washAbleTester{
    public static void main(String[] args) {
        washAble [] arr={new Car(),new Horse()};
        for (washAble w:arr){
            w.wash();
        }
    }
}