package class11;

public class E8StringMethods {
    public static void main(String[] args) {
        String str= "Hi There how are you.I am Good. I am Driving";
        String[] strs=str.split("\\s");
        System.out.println(strs.length);
        System.out.println(strs[4]);
        for (String s:strs){
            System.out.print(s);
        }

    }
}
