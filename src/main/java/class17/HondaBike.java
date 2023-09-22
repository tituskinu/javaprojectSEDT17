package class17;

import class18.Bike;

public class HondaBike extends Bike {
    void printModel(){
        System.out.println(make);//how to us protected check package 18
        //from Bike class
    }
}
class Tester{
    public static void main(String[] args) {
        Bike b=new Bike();
        //System.out.println(b.make);
        //HashMap
    }
}