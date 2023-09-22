package class14;

public class T1ReverseWord {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.printInfo();// It's possible to access another class from
        //the  same package.


        String str="This is the sentence i want to reverse";
        String [] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word= arr[i];
            String reversed=reverseStr(word);
            System.out.print(reversed+" ");


        }



        System.out.println();
        System.out.println(str+" ");
    }
    static String reverseStr(String inputStr){
        String reversed="";
        for (int i = inputStr.length()-1; i >=0 ; i--) {
            reversed=reversed+inputStr.charAt(i);


        }
        return  reversed;
    }






}
