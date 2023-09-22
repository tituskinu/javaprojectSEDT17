package class23;

public class Registration {
    final private String email;
    private  String userName;
    private long password;

    public Registration(String email, String userName, long password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    public  String getEmail(){
        return email;
    }
    public String getuserName(){
        return userName;
    }

    public long getPassword(){return password;}
    void setUserName(String userName){
        this.userName=userName;
    }

}

