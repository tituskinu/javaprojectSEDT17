package review9;
/*
we can overload te private mathord
 */
public class Printer {
    void print(){
        System.out.println("Hello");
    }
    void print(String word){
        System.out.println(word);
    }
    void print(int n){
        System.out.println(n);
    }
   void print(String word,int n){
        System.out.println(word+" "+n);
    }
    void print(int n, String word){
        System.out.println(n+" "+word);
    }
    void print(int ... arr){ //var arr arguments
        for(int num:arr){
            System.out.println(num);
        }
       /* System.out.println("you can pass unlimited numbers int type ");
        System.out.println(arr[0]+" you can use even array");*/

    }
    void print (String ...a){
        System.out.println("you can pass unlimited words ");
    }
/*
we can also overload the main method
 */

    public static void main(String[] args) {

    }

    public static void main(int[] args) {

    }

}
