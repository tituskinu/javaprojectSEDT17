package class8;

public class T6Enhancedloop {
    public static void main(String[] args) {

        int[] nums={10,23,25,56,60,20,-10,-5};
        int smallest=nums[0];
        for ( int i:nums){
            if (i%2==0&&i<smallest) {

                    smallest=i;

            }
        }
        System.out.println(smallest);

    }

}
