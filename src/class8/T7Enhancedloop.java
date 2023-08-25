package class8;

public class T7Enhancedloop {
    public static void main(String[] args) {
        //replace all the negative numbers with 0

        int[] nums={10,23,25,56,60,20,-10,-5};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                nums[i]=0;
            }


        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
