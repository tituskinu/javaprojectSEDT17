package class20;

public class E7Final {
    public static void main(String[] args) {
        final int Age=12;
        System.out.println(Age);
    }
}
class Parent{ // you can declabra the parent class as final
    final void marry(){//the word final will not change to the child only the parent will display becouse on the word final
        System.out.println("take our permission first");
    }
}
/*class Child extends Parent{
    @Override
   /* void marry() {
        super.marry();
    }*/
