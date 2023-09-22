package class13;


import class14.BankAccount;

public class OtherClass {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
       // System.out.println(bankAccount.accountNumber); // not possible to access another package
       // bankAccount.accountNumber();//not accessible from a different package
        bankAccount.savings();// this is possible because the variable saving is public

    }
}
