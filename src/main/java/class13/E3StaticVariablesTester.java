package class13;

public class E3StaticVariablesTester {
    public static void main(String[] args) {


        System.out.println("Line1");
        System.out.println(E3StaticVariables.country); /*we don't need to creat an object to access
        static variable.
        * The downside of static variable is that it occupies the greatest time of the memory
        * they are universal when it comes to scope and accessibility
        they can be accessed from another class along as  they are declared as public

*/
        System.out.println();

        //this is an object
        E3InstantVariables e2 = new E3InstantVariables();
        e2.printAge();
        e2.printCountry();
    }
}
