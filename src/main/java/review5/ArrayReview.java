package review5;


    public class ArrayReview {
        public static void main(String[] args) {
            int a=10;
            int [] array={10,11,12,13,55,34,24};
            int numberOfElements=array.length;
            System.out.println(numberOfElements);
            System.out.println(array[3]);//getting one element
        /*
        when to use loops - when we want to repeat a loop
        when we do not know the exact number of iterations- while or do while
        when we know how many times we need to repeat or iterate the coe - for loop or enhance for loops
        we use enhance for loop only with a race or collections

        */
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");

            }
            System.out.println();
            /*
             * another name for enhance for loop is called is advance for loop/for each loop
             * */
            for(int  numbers:array){
                System.out.print(numbers+" ");
            }


        }


}
