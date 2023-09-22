package class16;

public class person {
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;
    public  person(){

    }
    public  person(String name, int age, double weight){
        this.name=name;
        this.age =age;
        this.weight=weight;


    }
    public  person(String name, int age, double weight, char gender){
        this.name=name;
        this.age =age;
        this.weight=weight;
        this.gender=gender;

    }
    public person(String name,int age,double weight,char gender,int salary,String hairColor){
        this(name,age,weight,gender);
        this.salary=salary;
        this.hairColor=hairColor;
    }




    public void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "+gender+" "+salary+" "+hairColor);
    }

}
