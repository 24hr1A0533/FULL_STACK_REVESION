class Student{
  String name;
  double marks;
  Student(String name,double marks){
    this.name=name;
    this.marks=marks;
  }
  void showResult(){
    System.out.println("name:"+name+" marks:"+marks);
  }
}
public class D2T18 {
  public static void main(String[] args) {
    Student obj=new Student("kishore",99);
    obj.showResult();
  }
  
}
