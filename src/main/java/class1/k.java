package class1;

public class k {

        public static void main(String args[]) {
            String obj = "I LIKE JAVA";
            System.out.println(obj.charAt(3));

            String str = "0123456789";
            System.out.println(str.substring(4));


            String word ="abrakadabra";

            String replace=word.replaceAll("[^aAeEiIoOuU]", "");

            System.out.println(replace);


            String str_Sample = "RockStar";
            System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));


        }
    }

