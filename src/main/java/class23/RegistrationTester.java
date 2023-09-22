package class23;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration r = new Registration("titus@gmail.com", "Titus", 12348);
        System.out.println("User Name: "+r.getuserName());
        System.out.println("Email: "+r.getEmail());
        System.out.println("Password: "+r.getPassword());
        r.setUserName("Kinuthia");
        System.out.println(r.getuserName());
    }
}