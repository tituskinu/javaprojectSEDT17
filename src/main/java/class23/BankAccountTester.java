package class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b =new BankAccount("Titus",12545,48545,"Ktitus","p12345","checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("kinuthia");
        System.out.println(b.getName());
    }
}
