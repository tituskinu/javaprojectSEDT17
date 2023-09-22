package review3;

public class E2LogicalOperaters {
    public static void main(String[] args) {
        boolean isMeat=true;
        boolean isEgg=true;
        boolean isFish=true;
        boolean milk=!true;
        boolean isProtein=isFish||isMeat||isEgg;
        boolean vegetables=true;

        boolean isGoodDiet=(isEgg||isMeat||isFish)&&milk&&vegetables;

        System.out.println(isProtein);
        System.out.println(isGoodDiet);


    }
}
