package review7;

public class BookTester {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.title="River-between";
        b1.author="Ngugi wathiongo";
        b1.year=1945;
        b1.price=45;
       // b1.page  will have a compiler error
        b1.read();
        b1.changePrice(41);
       double total=b1.totalWithTax(0.1);
        System.out.println("The new price with tax is = "+total);


    }


}
