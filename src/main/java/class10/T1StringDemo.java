package class10;

public class T1StringDemo {
    public static void main(String[] args) {

       String userName="User123";
       String password="Pass1234";
       String confirmPassword="Pass1234";
       if (userName.isEmpty()||password.isEmpty()) {
           System.out.println("User Name and password cannot be empty");

       } else if (password.length()<8) {
           System.out.println("Password is too short");

       } else if (password.contains(userName)) {
           System.out.println("Password cannot contain User Name");

       } else if (!password.equals(confirmPassword)) {
           System.out.println("Password does not match");

       }else {
           System.out.println("Your user name and password has been created ");
       }
    }
}
