package class8;

public class T4Enhancedloop {
    public static void main(String[] args) {

        //String [] names={"Tamim","Titus","Julia","Ali","Aysha","Marta","Cisel","Guilermo"};
       // for (String n:names){
       //     System.out.println(n);
        //}

        int[] nums={10,23,25,56,45,20};
        int largest=nums[0];
        for (int n:nums){
            if (n>largest){
                largest=n;
            }
        }
        System.out.println(largest);

    }
}
