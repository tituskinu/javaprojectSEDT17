package class13;

public class SyntaxEmployee {
 int empId;
 int salary;
 static String CEO="Sumair";

 public static void main(String[] args) {
  SyntaxEmployee Titus = new SyntaxEmployee();
  Titus.empId=56488;
  Titus.salary=45000;



  SyntaxEmployee Ann= new SyntaxEmployee();
  Ann.empId=78554;
  Ann.salary=78412;
  System.out.println(Ann.empId+"  "+ Ann.salary);
  System.out.println(Titus.empId+"  "+ Titus.salary);
  System.out.println(SyntaxEmployee.CEO);
 }




}
