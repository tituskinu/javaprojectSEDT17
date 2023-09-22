package class12;

public class T3Email {
    String fNmae = "john";
    String lName = "Snow";

    String creatEmail() {
        String e=fNmae.concat(lName).toLowerCase();

        return e;
    }
}
