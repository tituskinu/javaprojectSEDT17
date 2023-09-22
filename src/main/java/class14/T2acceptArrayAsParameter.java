package class14;

public class T2acceptArrayAsParameter {
    int [] num={23,52,77,89,54,15,5};
    int sum=0;
    public void number(){
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        T2acceptArrayAsParameter sun=new T2acceptArrayAsParameter();
        sun.number();

    }


}
