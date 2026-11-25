class Person{
  String name="lohith";
  void displyPerson(){
    System.out.println("name:"+name);
  }

}
class Employee extends Person{
  int employeeid=99;
  void displayEmploye(){
    System.out.println("id:"+employeeid);
  }
}
class Manager extends Employee{
  String dept="cse";
  void displayManager(){
    System.out.println("dept:"+dept);
  }
}

public class MultiLevelInheritance {
  public static void main(String[] args) {
    Manager obj = new Manager();
    obj.displayEmploye();
    obj.displayManager();
    obj.displyPerson();
  }
  
}
