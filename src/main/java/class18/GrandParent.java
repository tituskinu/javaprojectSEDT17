package class18;
/*
inheritance with constructors
 */
public class GrandParent {
    public GrandParent(){
        System.out.println("Grandpa");
    }
}
class Parent extends GrandParent{
    public Parent(){
        System.out.println("Parent");
    }
}

class Children extends Parent{
    Children(){
        System.out.println("Children");
    }
}
class Tester{
    public static void main(String[] args) {

        Children c=new Children();
    }
}
