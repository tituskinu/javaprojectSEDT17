package class16;

public class Students {
    private String name;
    private int Math;
    private int Eng;
    private int Java;


    Students(String name,int Math,int Eng,int Java){
        this.name=name;
        this.Math=Math;
        this.Eng=Eng;
        this.Java=Java;
    }
    int Agrade(String name,int Math,int Eng,int Java){

        int agrade=0;
        agrade=(Math+Eng+Java)/3;
        return agrade;
    }

   public void displayInfo(){
       System.out.println(name+" "+Math+" "+Eng+" "+Java);
   }
}
