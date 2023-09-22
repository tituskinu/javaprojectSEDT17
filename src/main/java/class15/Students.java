package class15;

public class Students {
    private String name;
    private int Math;
    private int Eng;
    private int Java;


    Students(String cName,int cMath,int cEng,int cJava){
        name=cName;
        Math=cMath;
        Eng=cEng;
        Java=cJava;
    }
    int Agrade(String cName,int cMath,int cEng,int cJava){

        int agrade=0;
        agrade=(cMath+cEng+cJava)/3;
        return agrade;
    }

    public static void main(String[] args) {
        Students t1=new Students("",0,0,0);
        System.out.println(t1.Agrade("Titus",84,99,99));
        System.out.println(t1.Agrade("Titus",74,49,69));
        System.out.println();



    }

}
