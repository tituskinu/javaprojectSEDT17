package class14;

public class T2 {
    public static void main(String[] args) {
        T2 t2=new T2();
        int[] array={10,25,15};
        System.out.println(t2.getArrSum(array));
    }
    int getArrSum(int[] arr){
        int sum=0;
        for (int n:arr){
            sum=sum+n;

        }
        return sum;
    }
}
