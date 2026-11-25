
  class Calculator{
  int add(int a , int b){
    return a+b;
  }
}
class Maths extends Calculator{
  @Override 
  int add(int a, int b){
    System.out.println("anil");
    return a+b;
  }
}
public class RuntimePolymorphism {
  public static void main(String[] args) {
    Calculator obj = new Calculator();
    System.out.println(obj.add(2,2));
  
  }
}

