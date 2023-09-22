package class19;

public class T5Degree {
   public void getPrerequisite(){
       System.out.println("To get a Bachelor degree you need a diploma in high school diploma");

    }
}
class Bachelors extends T5Degree {

}
class Masters extends T5Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("You will get a Masters Degree if you have Bachelors degree");
    }
}

