package Project;
/*Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.*/
public class Task12 {

    private String email;
    private String userName;
    private String password;

    public Task12() {

    }

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Not a valid email address");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName.");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password.");
        }
    }

    public void displayRegistration() {
        System.out.println("Registration Information:");
        System.out.println("Email: " + email);
        System.out.println("UserName: " + userName);

    }

    public static void main(String[] args) {
        Task12 registration = new Task12();


        registration.setEmail("user@yahoo.com");
        registration.setUserName("validUserName");
        registration.setPassword("validPassword");
        registration.displayRegistration();

        registration.setEmail("invalid@gmail.com");
        registration.setUserName("short");
        registration.setPassword("passwordwithshort");

        registration.displayRegistration();
    }
}
