package class13;

public class E3StaticVariables {
    /*
    Static Variable are created inside a class but outside of a block of code
     with a static keyword

     a local variable can not be static

*/
    String name="Hindi";
    void printAge(){
        int age=25;
        System.out.println(age);
    }
    void printCountry(){
        System.out.println(name);
        System.out.println(country);
        if (10>5){
            System.out.println(country);
        }
    }
    static String country="Uganda";
}
