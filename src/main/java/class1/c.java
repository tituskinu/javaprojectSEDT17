package class1;

import java.util.Arrays;

public class c {
     public final String a() {
         int []a={2,7,3,8,4};
         StringBuilder sb=new StringBuilder(Arrays.toString(a));
         return sb.reverse().toString();


    }
    public static void main(String[] args) {
        c v=new c();
        v.a();
        System.out.println(v.a());
    }


}
