package review5;


    public class AnotherReview {
        public static void main(String[] args) {
            int a=10;
            double [] price={1.99,12.09,1,4.50};

        /*
        when to use loops - when we want to repeat a loop
        when we do not know the exact number of iterations- while or do while
        when we know how many times we need to repeat or iterate the coe - for loop or enhance for loops
        we use enhance for loop only with a race or collections

        */

            /*
             * another name for enhance for loop is called is advance for loop/for each loop
             * */
            for (int i = 0; i < price.length; i++) {
                System.out.println(price[i]);

            }
            System.out.println();

           for(double numbers:price){
               System.out.println(numbers);
           }


        }


}
