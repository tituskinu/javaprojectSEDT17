package review7;

public class Book {
    /*
    Syntax of variables
    DataType name;
     */
    String title;
    String author;
    int year;
    int page;
    double price;
    /* Syntax of method
    returnType name
    void read()

    i can create my own methods:
        1. with parameters or without
        2. with return type or without


     */
    void read(){
        System.out.println("I amd reading a book called "+title+". The author of the book is "+author);

    }

    void changePrice(int newPrice){
        System.out.println("The price of the book "+title+ "  was change from "+price+" to "+newPrice);

    }

    double totalWithTax(double tax){
        double total= price+(price*tax);


        return total;
    }

}
