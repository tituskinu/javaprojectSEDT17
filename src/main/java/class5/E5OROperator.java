package class5;

public class E5OROperator {
    public static void main(String[] args) {
        boolean broughtFlowers=true;
        boolean broughtChocolate=false;
        boolean allMyMistake=true;
        if (broughtChocolate || broughtFlowers || allMyMistake){
            System.out.println("wife is happy");
        }else {
            System.out.println("wife is sad");
        }
    }
}
