package class8;

public class T5Enhancedloop {
    public static void main(String[] args) {

        //String [] names={"Tamim","Titus","Julia","Ali","Aysha","Marta","Cisel","Guilermo"};
       // for (String n:names){
       //     System.out.println(n);
        //}

        int[] nums={10,23,25,56,60,20};
        int largest=nums[0];
        for ( int i:nums){
            if (i%2==0&&i>largest) {

                    largest=i;

            }
        }
        System.out.println(largest);

    }

}
