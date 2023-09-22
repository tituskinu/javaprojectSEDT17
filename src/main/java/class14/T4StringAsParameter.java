package class14;

public class T4StringAsParameter {

    public static void main(String[] args) {
        System.out.println(getVowels("yerBADBoy"));
    }
    private static String getVowels(String str){
        return str.replaceAll("[aeiouAEIOU]","");


    }


}
