package class9;

import java.util.Arrays;

public class E3TwoDArray {
    public static void main(String[] args) {
       int [] row0={10,20,30,40};
       int [] row1={100,200,303,400};
       int [] row2={1,2,3,4};


       int [] [] numbers={
               {10,20,30,40},
               {100,200,303,400},
               {1,2,3,4}
       };
       int [] row= numbers[0]; //this returns us a complete 1D array
        int number=numbers[0][1]; // this returns us one single element
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(numbers[0][1]);

    }


}