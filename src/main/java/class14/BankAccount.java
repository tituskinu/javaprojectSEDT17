package class14;

public class BankAccount {
    private String name = "Fahim";
    private String userName = "Fahim123";
    private String password = "pass123";
    private double accountBalance = -300;
    String accountNumber = "12345";
   // public int savings=1255456;

    void printInfo() {
        System.out.println("I am Titus from  batch17");
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.name);
    }

    public void savings() {
        System.out.println("The available balance is $125,545");
    }
}