package class23;

public class BankAccount {
   private String name;
   final long bankAccountNumber;
   private double balance;
   final private String UserName;
   private String password;
   private String accountType;

    public BankAccount(String name, long bankAccountNumber, double balance, String userName, String password, String accountType) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        UserName = userName;
        this.password = password;
        this.accountType = accountType;
    }

    public BankAccount(long bankAccountNumber,String userName, String password,String accountType) {
        this.bankAccountNumber = bankAccountNumber;
        UserName = userName;
        this.password = password;
        this.accountType=accountType;
    }
    public BankAccount(String userName, String password,long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        UserName = userName;
        this.password = password;
    }


    public  String getName(){
        return name;
    }
    public long getBankAccountNumber(){
        return bankAccountNumber;
    }
    void setName(String name){
        this.name=name;
    }
    String getAccountType(){
        return accountType;
    }


}
