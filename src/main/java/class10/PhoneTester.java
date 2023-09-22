package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone titusObj= new Phone();
        titusObj.name="iphone";
        titusObj.make="14 maxpro";
        titusObj.pixel=1235646;
        titusObj.os="IOS 17";

        System.out.println();
        System.out.println(titusObj.name);
        System.out.println(titusObj.make);
        System.out.println(titusObj.os);
        System.out.println(titusObj.pixel);
        titusObj.brandName();
        titusObj.battery();
        titusObj.camera();
        titusObj.screen();
        System.out.println();


        Phone titusKObj= new Phone();
        titusKObj.name="Sumsung";
        titusKObj.make="Note Pad";
        titusKObj.pixel=5884465;
        titusKObj.os="12.548";
        System.out.println();
        System.out.println(titusKObj.name);
        System.out.println(titusKObj.make);
        System.out.println(titusKObj.os);
        System.out.println(titusKObj.pixel);

        titusKObj.sam();
        titusKObj.screen();



    }
}
