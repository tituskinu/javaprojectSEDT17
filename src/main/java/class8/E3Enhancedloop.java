package class8;

public class E3Enhancedloop {
    public static void main(String[] args) {

        //String [] names={"Tamim","Titus","Julia","Ali","Aysha","Marta","Cisel","Guilermo"};
       // for (String n:names){
       //     System.out.println(n);
        //}

        int[] num={10,23,25,56,45,20};
        int count=0;
        for (int t:num){
            if (t>20){
                count++;
            }
        }
        System.out.println(count);

    }
}
